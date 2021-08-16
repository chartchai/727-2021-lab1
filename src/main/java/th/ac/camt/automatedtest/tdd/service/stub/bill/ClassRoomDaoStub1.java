package th.ac.camt.automatedtest.tdd.service.stub.bill;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomDaoStub1 implements ClassRoomDao{

    @Override
    public List<Student> getStudents() {
        List<Student> output = new ArrayList<>();
        output.add(new Student("20213021 ","Yoki","1.01"));
        output.add(new Student("20213022 ","Mayon","2.01"));
        output.add(new Student("20204088 ","Sita","3.33"));
        output.add(new Student("20204089 ","Oii","4.00"));
        return output;
    }

}
