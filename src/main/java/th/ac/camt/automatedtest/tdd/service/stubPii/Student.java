package th.ac.camt.automatedtest.tdd.service.stubPii;

public class Student {
    String studentId;
    String name;
    Double gpa;
    Integer RoomId;

    public Student(String studentId, String name, Double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    public Student(String studentId, String name, Double gpa, Integer roomId) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
        RoomId = roomId;
    }

    public Student() {
    }
}
