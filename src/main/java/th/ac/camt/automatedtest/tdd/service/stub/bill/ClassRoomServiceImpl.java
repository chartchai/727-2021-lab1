package th.ac.camt.automatedtest.tdd.service.stub.bill;

public class ClassRoomServiceImpl implements ClassRoomService{

    ClassRoomDao classRoomDao;

    public ClassRoomDao getClassRoomDao() {
        return classRoomDao;
    }

    public void setClassRoomDao(ClassRoomDao classRoomDao) {
        this.classRoomDao = classRoomDao;
    }

    public ClassRoomServiceImpl(ClassRoomDao classRoomDao) {
        this.classRoomDao = classRoomDao;
    }

    public double getTotalGpa(){
       return 0;
   };
}
