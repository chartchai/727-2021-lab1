package th.ac.camt.automatedtest.tdd.service.stub.bill;

import java.util.List;

public class ClassStudentServiceImpl extends ClassStudentService {
    ClassRoomDao classRoomDao;

    public ClassStudentServiceImpl(ClassRoomDao classRoomDao) {
        this.classRoomDao = classRoomDao;
    }

}