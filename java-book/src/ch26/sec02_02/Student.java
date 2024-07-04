package ch26.sec02_02;

public class Student {
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
        return grade;
    }
}
