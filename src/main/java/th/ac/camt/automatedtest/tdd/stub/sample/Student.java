package th.ac.camt.automatedtest.tdd.stub.sample;

import java.util.Objects;

public class Student {
    String studentId;
    String name;
    double gpa;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.gpa, gpa) == 0 && Objects.equals(studentId, student.studentId) && Objects.equals(name, student.name) && Objects.equals(roomId, student.roomId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, gpa, roomId);
    }

    String roomId;

    public Student(String studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }
}
