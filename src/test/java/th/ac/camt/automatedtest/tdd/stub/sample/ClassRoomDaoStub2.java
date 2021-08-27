package th.ac.camt.automatedtest.tdd.stub.sample;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomDaoStub2 implements ClassroomDao{
    @Override
    public List<Student> getStudents() {
        List<Student> output  = new ArrayList<>();
        output.add(new Student("20195003","Pii",2.6));
        output.add(new Student("20195001","Kong",3.98));
        output.add(new Student("20195002","Plo",2.89));

        return output;
    }

    public List<Student> getStudents(int roomNo) {
        return null;
    }
}
