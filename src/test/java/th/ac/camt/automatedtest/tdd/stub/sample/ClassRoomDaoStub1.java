package th.ac.camt.automatedtest.tdd.stub.sample;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomDaoStub1 implements ClassroomDao{
    @Override
    public List<Student> getStudents() {
        List<Student> output  = new ArrayList<>();
        output.add(new Student("20195006"
                ,"Jiramed",3.9));
        return output;
    }

    public List<Student> getStudents(int roomNo) {
        return null;
    }
}
