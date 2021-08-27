package th.ac.camt.automatedtest.tdd.stub.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ClassroomServiceImplTest {

//    @Test
    void getTotalGpa() {
        ClassroomDao classroomDao = new ClassroomDaoImpl();
        ClassroomServiceImpl classroomService =
                new ClassroomServiceImpl(classroomDao);
//        classroomService.setClassroomDao(classroomDao);
        assertThat(classroomService.getTotalGpa()
                ,is(closeTo(2.3,0.01)));
    }
    @Test
    void getTotalGpa01() {
        ClassroomDao classroomDao = new ClassRoomDaoStub1();
        ClassroomServiceImpl classroomService =
                new ClassroomServiceImpl(classroomDao);
//        classroomService.setClassroomDao(classroomDao);
        assertThat(classroomService.getTotalGpa()
                ,is(closeTo(3.90,0.01)));
    }

    @Test
    void getTotalGpa02() {
        ClassroomDao classroomDao = new ClassRoomDaoStub2();
        ClassroomServiceImpl classroomService =
                new ClassroomServiceImpl(classroomDao);
//        classroomService.setClassroomDao(classroomDao);
        assertThat(classroomService.getTotalGpa()
                ,is(closeTo(3.16,0.01)));
    }

    @Test
    void getTotalGpaWithRoom1(){
        ClassroomDao classroomDao = new ClassroomDaoStubWithRoom1();
        ClassroomServiceImpl classroomService =
                new ClassroomServiceImpl(classroomDao);
        assertThat(classroomService.getTotalGpa(701),is(closeTo(2.67,0.01)));
    }


    @Test
    void getTotalGpaByMockito1(){
        ClassroomDao classroomDao = mock(ClassroomDao.class);
        //setup
        when(classroomDao.getStudents()).thenReturn(
                Arrays.asList(
                        new Student("20195003","Pii",2.6),
                        new Student("20195001","Kong",3.98),
                        new Student("20195002","Plo",2.89)));
        ClassroomService classroomService = new ClassroomServiceImpl(classroomDao);
        assertThat(classroomService.getTotalGpa()
                ,is(closeTo(3.16,0.01)));
    }
    @Test
    void getTotalGpaByMockito2(){
        ClassroomDao classroomDao = mock(ClassroomDao.class);
        //setup
        when(classroomDao.getStudents(701)).thenReturn(
                Arrays.asList(
                        new Student("20195003","Pii",2.6),
                        new Student("20195001","Kong",3.98),
                        new Student("20195002","Plo",2.89)));
        when(classroomDao.getStudents(702)).thenThrow(new IdNotFoundException());
        final ClassroomService classroomService = new ClassroomServiceImpl(classroomDao);
        assertThat(classroomService.getTotalGpa(701)
                ,is(closeTo(3.16,0.01)));
        Assertions.assertThrows(IdNotFoundException.class,()->{
            classroomService.getTotalGpa(702);
        });
    }
}