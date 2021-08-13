package th.ac.camt.automatedtest.tdd.service.stubPii;

public class ClassroomServiceImpl implements ClassroomService{
    ClassroomDao classroomDao;

    public void setClassroomDao(ClassroomDao classroomDao) {
        this.classroomDao = classroomDao;
    }

    public double getTotalGpa() {
        return 3.9;
    }
}
