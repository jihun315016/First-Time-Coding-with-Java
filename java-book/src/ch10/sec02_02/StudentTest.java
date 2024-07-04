package ch10.sec02_02;

public class StudentTest {
    public static void main(String[] args) {
        Middle m = new Middle("이순신", 2);
        Colleage c = new Colleage("홍길동", 3);

        m.calcScore(m);
        c.calcScore(c);
    }
}
