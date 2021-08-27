package th.ac.camt.automatedtest.tdd.stub.sample;

import java.util.List;

public interface ClassroomDao {
    List<Student> getStudents();
    List<Student> getStudents(int roomNo);
}
