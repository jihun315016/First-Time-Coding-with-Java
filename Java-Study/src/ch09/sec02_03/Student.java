package ch09.sec02_03;

public class Student {
    protected String name;
    protected int grade;

    public Student() {
        System.out.println("Student 기본 생성자 호출");
    }

    public Student(String name, int grade) {
        System.out.println("매개변수가 있는 Student 생성자 호출");
        this.name = name;
        this.grade = grade;
    }

    public void study() {
        System.out.println("시험 공부를 합니다.");
    }

    public int test() {
        System.out.println("시험 점수입니다.");
        return 0;
    }

    public String getStudentInfo() {
        return "이름 : " + this.name + ", 학년 : " + this.grade;
    }
}
