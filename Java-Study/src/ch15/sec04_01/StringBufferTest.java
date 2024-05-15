package ch15.sec04_01;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Hello World
        stringBuffer.append(" World");
        System.out.println(stringBuffer);

        // Hello
        stringBuffer.delete(5, stringBuffer.length());
        System.out.println(stringBuffer);
    }
}
