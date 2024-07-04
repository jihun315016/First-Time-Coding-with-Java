package ch09.sec02_01;

public class Middle extends Student {
    public Middle(String name, int grade) {
        System.out.println("Middle 클래스 생성자 호출");
        
        this.name = name;
        this.grade = grade;
    }
}
