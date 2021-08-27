package th.ac.camt.automatedtest.tdd.db.dao;

import th.ac.camt.automatedtest.tdd.stub.sample.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudent();
}
