package ch11.sec02_04;

public class Colleage extends Student {
    private int courses;

    public Colleage() {
        this("이순신", 2, 20, "홍길동");
    }

    public Colleage(String name, int grade, int courses, String teacher) {
        super(name, grade);
        super.teacher = teacher;
        this.courses = courses;
    }

    public int getCourses() {
        return courses;
    }

    public String getStudInfo() {
        return "이름은 >> " + this.name + ", 학년은 >> " + this.grade + ", 신청 학점은 >> " + this.courses;
    }

    @Override
    public String getTeacher() {
        return "지도 교수님 : " + teacher;
    }
}
