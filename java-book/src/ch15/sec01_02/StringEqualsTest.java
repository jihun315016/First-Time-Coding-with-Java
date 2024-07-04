package ch15.sec01_02;

public class StringEqualsTest {
    public static void main(String[] args) {
        String name1 = "이순신";
        String name2 = "이순신";
        String name3 = "홍길동";

        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name3.equals(name1));

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}