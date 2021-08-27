package th.ac.camt.automatedtest.tdd.db.service;

import th.ac.camt.automatedtest.tdd.stub.sample.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudentGPALessThan(double gpa);
    List<Student> getStudentGPAHigherThan(double gpa);
}
