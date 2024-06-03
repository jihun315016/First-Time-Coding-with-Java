package ch26.sec02_03;

import java.util.stream.IntStream;

public class IntStreamRangeClosedTest {
    static int sum = 0;

    public static void main(String[] args) {
        IntStream intStream1 = IntStream.range(10, 15);
        IntStream intStream2 = IntStream.rangeClosed(10, 15);

        intStream1.forEach(i -> sum = sum + i);
        System.out.println(sum);
        sum = 0;
        intStream2.forEach(i -> sum = sum + i);
        System.out.println(sum);
    }
}
