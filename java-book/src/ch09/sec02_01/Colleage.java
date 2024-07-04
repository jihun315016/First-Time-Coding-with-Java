package ch09.sec02_01;

public class Colleage extends Student {
    private int courses;

    public Colleage(String name, int grade, int courses) {
        System.out.println("Colleage 생성자 호출");
        
        this.name = name;
        this.grade = grade;
        this.courses = courses;
    }

    public int getCourses() {
        return courses;
    }
}
