package ch11.sec02_04;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Colleage("홍길동", 3, 22, "차범근");
        Middle m = new Middle("이순신", 2, "손흥민");

        System.out.println("s 학생 정보 : " + s.getStudInfo() + " >> " + s.getTeacher());
        System.out.println("m 학생 정보 : " + m.getStudInfo() + ", " + m.getTeacher());
    }
}
