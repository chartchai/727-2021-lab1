package th.ac.camt.automatedtest.tdd.service.stub.bill;

import java.util.Objects;

public class Student {
    String studentId;
    String name;
    String gpa;

    public Student(String studentId, String name, String gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId.equals(student.studentId) && name.equals(student.name) && gpa.equals(student.gpa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, gpa);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }


}
