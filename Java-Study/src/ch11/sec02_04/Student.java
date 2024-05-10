package ch11.sec02_04;

public abstract class Student {
    protected String name;
    protected int grade;
    protected String teacher;

    public Student() { }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getStudInfo() {
        return "이름 : " + this.name + ", 학년 : " + this.grade;
    }

    public abstract String getTeacher(); // 추상 메서드
}
