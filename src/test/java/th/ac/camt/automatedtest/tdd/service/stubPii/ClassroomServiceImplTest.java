package th.ac.camt.automatedtest.tdd.service.stubPii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ClassroomServiceImplTest {

    //    @Test
    void getTotalGpa() {
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        ClassroomDao classroomDao = new ClassroomDaoImpl();
        classroomService.setClassroomDao(classroomDao);
        assertThat(classroomService.getTotalGpa(), is(closeTo(2.3, 0.01)));
    }

    @Test
    void getTotalGpastub() {
        ClassroomDao classroomDao = new ClassroomDaoStub1();
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        classroomService.setClassroomDao(classroomDao);
        assertThat(classroomService.getTotalGpa(), is(closeTo(3.9, 0.005)));
    }

    @Test
    void getTotalGpaStubCeilDown() {
        ClassroomDao classroomDao = new ClassroomDaoStub2();
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        classroomService.setClassroomDao(classroomDao);
        assertThat(classroomService.getTotalGpa(), is(closeTo(2.66, 0.005)));
    }

    @Test
    void getTotalGpaStubCeilUp() {
        ClassroomDao classroomDao = new ClassroomDaoStub3();
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        classroomService.setClassroomDao(classroomDao);
        assertThat(classroomService.getTotalGpa(), is(closeTo(3.16, 0.005)));
    }

    @Test
    void getTotalGpaStubFail() {
        Assertions.assertThrows(NoGpaException.class, () -> {
            ClassroomDao classroomDao = new ClassroomDaoStub4();
            ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
            classroomService.setClassroomDao(classroomDao);
            classroomService.getTotalGpa();
        });
    }

    @Test
    void getTotalGpaStubWithRoomId() {
        ClassroomDao classroomDao = new ClassroomDaoStubWithRoomId1();
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        classroomService.setClassroomDao(classroomDao);
        assertThat(classroomService.getTotalGpa(701), is(closeTo(2.67, 0.005)));
    }

    @Test
    void roomIdNotFoundException() {
        Assertions.assertThrows(RoomIdNotFoundException.class, () -> {
            ClassroomDao classroomDao = new ClassroomDaoStubWithRoomId2();
            ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
            classroomService.setClassroomDao(classroomDao);
            classroomService.getTotalGpa(1684);
        });
    }

    @Test
    void getTotalGpaWithMockito() {
        ClassroomDao classroomDao = mock(ClassroomDao.class);
        //setup
        when(classroomDao.getStudents(701)).thenReturn(
                Arrays.asList(
                        new Student("20213021", "Yoki", 1.10),
                        new Student("20213022", "Mayon", 2.22),
                        new Student("20204088", "Sita", 3.33),
                        new Student("20204089", "Oil", 4.00)
                ));
        when(classroomDao.getStudents(703)).thenThrow(new RoomIdNotFoundException());
        when(classroomDao.getStudents(702)).thenReturn(
                Arrays.asList(
                        new Student("20195004", "Jumma", 1.10),
                        new Student("20195003", "John slepp", 2.22),
                        new Student("20195001", "Jim slave", 3.4),
                        new Student("20195002", "Jack slow", 2.6),
                        new Student("20195006", "jiramed", 3.98),
                        new Student("20195069", "John doe", 2.58)
                ));
        final ClassroomService classroomService = new ClassroomServiceImpl(classroomDao);
        assertThat(classroomService.getTotalGpa(701), is(closeTo(2.67, 0.005)));
        assertThat(classroomService.getTotalGpa(702), is(closeTo(3.05, 0.005)));
        Assertions.assertThrows(RoomIdNotFoundException.class, () -> {
            classroomService.getTotalGpa(703);
        });

    }
}