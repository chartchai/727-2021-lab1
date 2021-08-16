package th.ac.camt.automatedtest.tdd.service.stubPii;

import java.util.ArrayList;
import java.util.List;

public class ClassroomDaoStub2 implements ClassroomDao{
    @Override
    public List<Student> getStudents() {
        List<Student> output = new ArrayList<>();
        output.add(new Student("20213021","Yoki",1.10));
        output.add(new Student("20213022","Mayon",2.22));
        output.add(new Student("20204088","Sita",3.33));
        output.add(new Student("20204089","Oil",4.00));
        return output;
    }
}
