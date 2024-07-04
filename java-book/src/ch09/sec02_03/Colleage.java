package ch09.sec02_03;

public class Colleage extends Student {
    private int courses;

    public Colleage(String name, int grade, int courses) {
        // 명식적으로 부모 클래스의 매개변수가 2개인 생성자 호출
        // super(name, grade);
        this(name, grade);
        System.out.println("Colleage 생성자 호출");
        this.courses = courses;
    }

    public Colleage(String name, int grade) {
        super.name = name;
        super.grade = grade;
    }

    public int getCourses() {
        return courses;
    }
}
