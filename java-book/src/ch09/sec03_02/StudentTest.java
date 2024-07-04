package ch09.sec03_02;

public class StudentTest {
    public static void main(String[] args) {
        String info = null;
        Colleage c1 = new Colleage("홍길동", 2, 21);
        Colleage c2 = new Colleage();

        info = c1.getStudentInfo();
        System.out.println("학생 정보 1");
        System.out.println(info);

        info = c2.getStudentInfo();
        System.out.println("학생 정보 2");
        System.out.println(info);
    }
}
