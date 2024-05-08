package ch09.sec02_03;

public class Middle extends Student {
    public Middle(String name, int grade) {
        System.out.println("Moddle 클래스 생성자 호출");

        // super를 이용해서 부모 클래스의 필드를 명시적으로 표시할 수 있다.
        super.name = name;
        super.grade = grade;
    }
}
