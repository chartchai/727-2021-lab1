package th.ac.camt.automatedtest.tdd.db.service;

import th.ac.camt.automatedtest.tdd.db.dao.StudentDao;
import th.ac.camt.automatedtest.tdd.stub.sample.Student;

import java.util.List;

public class StudentServiceImpl implements  StudentService{

    StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> getStudentGPALessThan(double gpa) {
        return null;
    }

    @Override
    public List<Student> getStudentGPAHigherThan(double gpa) {
        return null;
    }

    @Override
    public Student getStudentById(String id) {
        return null;
    }
}
