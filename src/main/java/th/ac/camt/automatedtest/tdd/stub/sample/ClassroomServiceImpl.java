package th.ac.camt.automatedtest.tdd.stub.sample;

public class ClassroomServiceImpl implements ClassroomService{
    public void setClassroomDao(ClassroomDao classroomDao) {
        this.classroomDao = classroomDao;
    }

    public ClassroomServiceImpl(ClassroomDao classroomDao) {
        this.classroomDao = classroomDao;
    }

    ClassroomDao classroomDao;
    public double getTotalGpa(){
        return 3.9;
    }

    @Override
    public double getTotalGpa(int roomNumber) {
        return 0;
    }
}
