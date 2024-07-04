package ch17.sec01_06;

import java.util.Objects;

public class Student {
    String id;
    String name;

    public Student() { }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        String _id = ((Student)obj).id;
        return this.id.equals(_id);
    }

    @Override
    public String toString() {
        return "(" + this.id + " / " + this.name + ")";
    }
}
