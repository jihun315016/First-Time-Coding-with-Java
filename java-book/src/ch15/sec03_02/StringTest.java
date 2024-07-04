package ch15.sec03_02;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "Hello World";
        str1 = "Hello Java";
        System.out.println(str1.charAt(0) + " " + str1.charAt(3));
        System.out.println(str1.indexOf("H", 0) + " " + str1.indexOf("o", 0));
        System.out.println(str1.substring(2, 5)); // 2번 인덱스 ~ 5번 인덱스 -> 3글자
        System.out.println(str1.startsWith("He"));
        System.out.println(str1.endsWith("ld"));

        String[] arr1 = str1.split(" ");
        for (String s : arr1) {
            System.out.println(s);
        }
    }
}
