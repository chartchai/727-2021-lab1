package th.ac.camt.automatedtest.tdd.service.stubPii;

import java.util.ArrayList;
import java.util.List;

public class ClassroomDaoStub1 implements ClassroomDao{
    @Override
    public List<Student> getStudents() {
        List<Student> output = new ArrayList<>();
        output.add(new Student("20195006","Jiramed",3.90));
        return output;
    }

    @Override
    public List<Student> getStudents(int roomNo) {
        return null;
    }
}
