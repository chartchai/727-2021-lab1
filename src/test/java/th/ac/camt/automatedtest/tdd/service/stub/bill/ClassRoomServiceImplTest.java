package th.ac.camt.automatedtest.tdd.service.stub.bill;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

class ClassRoomServiceImplTest {

    @Test
    void getTotalGpa() {
        ClassRoomDao classRoomDao = new ClassRoomDaoImpl();
        ClassRoomService classRoomService =new ClassRoomServiceImpl(classRoomDao);
        assertThat(classRoomService.getTotalGpa(),is(closeTo(2.3,0.01)));
    }

    @Test
    void getTotalStub() {
        ClassRoomDao classRoomDao = new ClassRoomDaoStub1();
        ClassRoomService classRoomService =new ClassRoomServiceImpl(classRoomDao);
        assertThat(classRoomService.getStub1(),is(closeTo(2.66,0.01)));

    }

    @Test
    void getTotalStub2() {
        ClassRoomDao classRoomDao = new ClassRoomDaoStub2();
        ClassRoomService classRoomService =new ClassRoomServiceImpl(classRoomDao);
        assertThat(classRoomService.getStub2(),is(closeTo(3.16,0.01)));
    }

    @Test
    void getTotalStub3() {
        ClassRoomDao classRoomDao = new ClassRoomDaoStub3();
        ClassRoomService classRoomService =new ClassRoomServiceImpl(classRoomDao);
        assertThat(classRoomService.getStub3(),is(closeTo(3.9,0.01)));
    }

    @Test
    void getTotalStub4(){
        ClassRoomDao classRoomDao = new ClassRoomDaoStub4();
        ClassRoomService classRoomService =new ClassRoomServiceImpl(classRoomDao);
        assertThat(classRoomService.getStub4(),is(closeTo(0,0.01)));
    }

    @Test
    void getClassRooms1(){
        ClassRoomDao classRoomDao =new ClassRoomDaoStub1();
        ClassRoomService classRoomService = new ClassRoomServiceImpl(classRoomDao);
        assertThat(classRoomService.getTotalGpa(101),is(closeTo(2.66,0.01)));
        assertThat(classRoomService.getTotalGpa(105),is(closeTo(2.19,0.01)));

    }

    @Test
    void getClassRooms2(){
        ClassRoomDao classRoomDao =new ClassRoomDaoStub2();
        ClassRoomService classRoomService = new ClassRoomServiceImpl(classRoomDao);
        assertThat(classRoomService.getTotalGpa(309),is(closeTo(1.09,0.01)));
        assertThat(classRoomService.getTotalGpa(301),is(closeTo(2.89,0.01)));

    }

    @Test
    void getClassRooms3(){
        ClassRoomDao classRoomDao =new ClassRoomDaoStub2();
        ClassRoomService classRoomService = new ClassRoomServiceImpl(classRoomDao);
        assertThat(classRoomService.getTotalGpa(309),is(closeTo(2.99,0.01)));
        assertThat(classRoomService.getTotalGpa(404),is(closeTo(3.89,0.01)));

    }
    //Examples Mockito
    @Test
    void getTotalGetByMockito(){
        ClassRoomDao classRoomDao = mock(ClassRoomDao.class);
        when(classRoomDao.getStudents()).thenReturn(Arrays.asList(
                new Student("201005678","A","2.89"),
                new Student("290109","B","1.66")));
    }
    @Test
    void getTotalGetByMockitoRoomID(){
        ClassRoomDao classRoomDao = mock(ClassRoomDao.class);
        when(classRoomDao.getStudents(101)).thenReturn(Arrays.asList(
                new Student("201005678","A","2.89"),
                new Student("20213022 ","Mayon","2.01"),
                new Student("20204088 ","Sita","3.33"),
                new Student("20204089 ","Oii","4.00")));
        when(classRoomDao.getStudents(105)).thenReturn(Arrays.asList(
                new Student("20203022 ","0ii","2.19")));
        ClassRoomService classRoomService = new ClassRoomServiceImpl(classRoomDao);
        assertThat(classRoomService.getTotalGpa(101),is(closeTo(2.66,0.01)));
        assertThat(classRoomService.getTotalGpa(105),is(closeTo(2.19,0.01)));
    }

    @Test
    void getTotalGetMockitoNoFondRoomID(){
        ClassRoomDao classRoomDao = mock(ClassRoomDao.class);
        //setup
        when(classRoomDao.getStudents(404)).thenReturn(Arrays.asList(
                new Student("201005678","A","2.89"),
                new Student("20213022 ","Mayon","2.01"),
                new Student("20204088 ","Sita","3.33"),
                new Student("20204089 ","Oii","4.00")));
        when(classRoomDao.getStudents(404)).thenThrow(new IdNoFoundException());
        final ClassRoomService classRoomService = new ClassRoomServiceImpl(classRoomDao);
        assertThat(classRoomService.getTotalGpa(101),is(closeTo(2.66,0.01)));
        assertThat(classRoomService.getTotalGpa(101),is(closeTo(2.66,0.01)));
        Assertions.assertThrows(IdNoFoundException.class, ()->{
           classRoomService.getTotalGpa(404);
        });
    }


}