package th.ac.camt.automatedtest.tdd.service.stubPii;

import java.util.ArrayList;
import java.util.List;

public class ClassroomDaoStubWithRoomId2 implements ClassroomDao{
    @Override
    public List<Student> getStudents() {
        return null;
    }

    @Override
    public List<Student> getStudents(int roomNo) {
        if(roomNo == 702){
            List<Student> output = new ArrayList<>();
            output.add(new Student("20195004","Jumma",1.10));
            output.add(new Student("20195003","John slepp",2.22));
            output.add(new Student("20195001","Jim slave",3.33));
            output.add(new Student("20195002","Jack slow",4.00));
            output.add(new Student("20195006","jiramed",4.00));
            output.add(new Student("20195069","John doe",4.00));
        } else {
            throw new RoomIdNotFoundException();
        }
        return null;
    }

}
