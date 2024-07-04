package ch24.sec01_01;

public class Student extends Person {
    protected int grade;

    public Student() { }

    public Student(String name, int grade) {
        super.name = name;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "이름 " + name + ", 학년 " + grade;
    }
}
