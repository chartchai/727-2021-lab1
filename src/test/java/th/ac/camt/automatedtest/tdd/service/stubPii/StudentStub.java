package th.ac.camt.automatedtest.tdd.service.stubPii;

import th.ac.camt.automatedtest.tdd.service.search.Student;
import th.ac.camt.automatedtest.tdd.service.search.StudentDao;

import java.util.ArrayList;
import java.util.List;

public class StudentStub implements StudentDao {

    @Override
    public List<Student> getStudent() {
        List<Student> output = new ArrayList<>();
        output.add(new Student("001","Pii",101));
        output.add(new Student("002","Nan",101));
        output.add(new Student("001","Ploy",102));
        output.add(new Student("002","Kong",102));

    return output;
    }
}
