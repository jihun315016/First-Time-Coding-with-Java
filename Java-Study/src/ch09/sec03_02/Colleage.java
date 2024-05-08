package ch09.sec03_02;

import ch09.sec03_01.Student;

public class Colleage extends Student {
    private int courses;

    public Colleage() {
        this("이순신", 2, 20);
        System.out.println("Colleage 클래스의 기본 생성자 호출");
    }

    public Colleage(String name, int grade, int courses) {
        super();
        System.out.println("매개변수가 3개인 Colleage 생성자 호출");

        super.name = name;
        super.grade = grade;
        this.courses = courses;
    }

    public int getCourses() {
        return this.courses;
    }

    @Override
    public String getStudentInfo() {
        return "이름 >> " + name + ", 학년 >> " + grade + ", 신청 학점 >> " + courses;
    }
}
