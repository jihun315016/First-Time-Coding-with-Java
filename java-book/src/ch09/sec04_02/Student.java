package ch09.sec04_02;

public class Student {
    String name;
    private int grade;

    public Student() {
        System.out.println("Student 기본 생성자 호출");
    }

    public Student(String name, int grade) {
        System.out.println("매개변수가 있는 Student 생성자 호출");
        this.name = name;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
