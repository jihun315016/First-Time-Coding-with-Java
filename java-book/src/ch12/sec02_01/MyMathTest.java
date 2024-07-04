package ch12.sec02_01;

public class MyMathTest {
    public static void main(String[] args) {
        int result1 = MyMath.add(2, 3);
        System.out.println(result1);

        int result2 = MyMath.substract(3, 2);
        System.out.println(result2);

        System.out.println("PI : " + MyMath.pi);
    }
}
