package ch10.sec02_02;

public class Student {
    protected String name;
    protected int grade;

    public Student() { }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void study() {
        System.out.println("시험 공부를 합니다.");
    }

    public void calcScore(Student s) {
        if (s instanceof Colleage c) {
            System.out.println("대학생 " + c.name + " 학점 구하기");
        }
        else if (s instanceof Middle d) {
            System.out.println("중학생 " + d.name + " 점수 구하기");
        }
    }
}

class Middle extends Student {
    public Middle(String name, int grade) {
        super(name, grade);
    }
}

class Colleage extends Student {
    public Colleage(String name, int grade) {
        super(name, grade);
    }
}
