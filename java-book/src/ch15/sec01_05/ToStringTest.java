package ch15.sec01_05;

public class ToStringTest {
    public static void main(String[] args) {
        Student s = new Student("이순신", 24);

        System.out.println(s);
        System.out.println(s.toString());
    }
}
