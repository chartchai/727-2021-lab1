package th.ac.camt.automatedtest.tdd.stub.sample;

import java.util.ArrayList;
import java.util.List;

public class ClassroomDaoStubWithRoom1 implements ClassroomDao {
    @Override
    public List<Student> getStudents() {
        return null;
    }

    @Override
    public List<Student> getStudents(int roomNo) {
        if (roomNo == 701){
            List<Student> output = new ArrayList<>();
            output.add(new Student("20213021","Yoki",1.1));
            output.add(new Student("","",0.0));
        }
        return null;
    }
}
