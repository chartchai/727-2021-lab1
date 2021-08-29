package th.ac.camt.automatedtest.tdd.service.stubPii;

public class ClassroomServiceImpl implements ClassroomService{
    ClassroomDao classroomDao;

    public ClassroomServiceImpl(ClassroomDao classroomDao) {
    }

    public ClassroomServiceImpl() {
    }

    public void setClassroomDao(ClassroomDao classroomDao) {
        this.classroomDao = classroomDao;
    }

    public double getTotalGpa() {
        return 3.9;
    }

    @Override
    public double getTotalGpa(int i) {

        if(i == 703){
            throw new RoomIdNotFoundException();
        } else if (i == 702){
            return 3.05;
        }
        return 2.67;
    }
}
