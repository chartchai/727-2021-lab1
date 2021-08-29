package th.ac.camt.automatedtest.tdd.service.search;

import java.util.Objects;

public class Student {
    String Id;
    String name;
    Integer RoomId;

    public Student(String s, String pii, double v, int i) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(Id, student.Id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(RoomId, student.RoomId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, RoomId);
    }

    public Student(String id, String name, Integer roomId) {
        Id = id;
        this.name = name;
        RoomId = roomId;
    }

    public Student() {
    }


}
