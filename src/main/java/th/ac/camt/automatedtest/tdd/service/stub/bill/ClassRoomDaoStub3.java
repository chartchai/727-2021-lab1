package th.ac.camt.automatedtest.tdd.service.stub.bill;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomDaoStub3 implements ClassRoomDao{

    @Override
    public List<Student> getStudents() {
        List<Student> output = new ArrayList<>();
        output.add(new Student("2021","Name","3.9"));
        return output;
    }

}
