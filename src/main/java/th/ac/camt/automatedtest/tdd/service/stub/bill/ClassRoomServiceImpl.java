package th.ac.camt.automatedtest.tdd.service.stub.bill;

import java.awt.*;
import java.util.ArrayList;

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

    public double getTotalGpa() {
       return 2.3;
   }

    @Override
    public double getTotalGpa(int roomId) {
        return 0;
    }


    public double getStub1(){
        return 2.66;
    }
    public double getStub2(){
        return 3.16;
    }
    public double getStub3(){
        return 3.90;
    }
    public double getStub4(){
        return 0;
    }
}
