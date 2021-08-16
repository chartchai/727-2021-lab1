package th.ac.camt.automatedtest.tdd.service.stub.bill;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomDaoStub2 implements ClassRoomDao{

    @Override
    public List<Student> getStudents() {
        List<Student> output = new ArrayList<>();
        output.add(new Student("20195003 ","Pii","2.60"));
        output.add(new Student("20195001  ","Kong ","3.98"));
        output.add(new Student("20195003 ","Plo","2.89"));
        return output;
    }

}
