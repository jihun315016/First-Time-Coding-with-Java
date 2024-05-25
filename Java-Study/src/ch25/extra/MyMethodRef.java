package ch25.extra;

public class MyMethodRef {
    public static void main(String[] args) {
        // myLambda 객체가 System.out 객체의 println 메서드 참조
        MyInterface myLambda = System.out::println;
        myLambda.printRef("Hello World");
    }
}

@FunctionalInterface
interface MyInterface {
    public void printRef(String message);
}