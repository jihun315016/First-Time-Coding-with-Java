package ch26.extra;

import java.util.List;
import java.util.ArrayList;

public class MapTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("kim", 2));
        list.add(new Student("Lee", 3));

        list.stream()
            .map(element -> element.toString())
            .forEach(item -> System.out.println(item));
        
        // kim 2학년
        // Lee 3학년
    }
}

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return this.name + " " + this.grade + "학년";
    }
}
