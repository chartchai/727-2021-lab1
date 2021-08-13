package th.ac.camt.automatedtest.tdd.service.stub.bill;

public class Student {
    String studentId;
    String name;
    String gpa;

    public Student(String studentId, String name, String gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
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
