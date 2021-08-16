package th.ac.camt.automatedtest.tdd.service.stub.bill;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;


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
}