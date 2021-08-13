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
        assertThat(classRoomService.getTotalGpa(),is(closeTo(2.3,0)));
    }

    @Test
    void getTotalStub() {
        ClassRoomDao classRoomDao = new ClassRoomDaoStub1();
        ClassRoomService classRoomService =new ClassRoomServiceImpl(classRoomDao);
        assertThat(classRoomService.getTotalGpa(),is(closeTo(3.9,0.01)));
    }
}