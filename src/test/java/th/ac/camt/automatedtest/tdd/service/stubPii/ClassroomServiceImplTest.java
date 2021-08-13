package th.ac.camt.automatedtest.tdd.service.stubPii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ClassroomServiceImplTest {

//    @Test
    void getTotalGpa() {
       ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
       ClassroomDao classroomDao = new ClassroomDaoImpl();
       classroomService.setClassroomDao(classroomDao);
       assertThat(classroomService.getTotalGpa(),is(closeTo(2.3,0.01)));
    }

    @Test
    void getTotalGpastub(){
        ClassroomDao classroomDao = new ClassroomDaoStub1();
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        classroomService.setClassroomDao(classroomDao);
        assertThat(classroomService.getTotalGpa(),is(closeTo( 3.9,0.005)));
    }

    @Test
    void getTotalGpaStubCeilDown(){
        ClassroomDao classroomDao = new ClassroomDaoStub1();
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        classroomService.setClassroomDao(classroomDao);
        assertThat(classroomService.getTotalGpa(),is(closeTo(2.66, 0.005)));
    }

    @Test
    void getTotalGpaStubCeilUp(){
        ClassroomDao classroomDao = new ClassroomDaoStub1();
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        classroomService.setClassroomDao(classroomDao);
        assertThat(classroomService.getTotalGpa(),is(closeTo(3.16, 0.005)));
    }

    @Test
    void getTotalGpaStubFail(){
        Assertions.assertThrows(NoGpaException.class,()->{
            ClassroomDao classroomDao = new ClassroomDaoStub1();
            ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
            classroomService.setClassroomDao(classroomDao);
        });

    }
}