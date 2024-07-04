package ch26.sec05_01;

import java.util.Arrays;

public class MatchTest {
    public static void main(String[] args) {
        int[] scoreArr = {55, 66, 77, 88, 99};
        boolean result;

        // Stream 요소가 모든 조건을 만족하는지 판별
        result = Arrays.stream(scoreArr)
            .allMatch(a -> a < 100);
        System.out.println(result); // true

        // Stream 요소가 하나의 조건이라도 만족하는지 판별
        result = Arrays.stream(scoreArr)
            .anyMatch(a -> a < 60);
        System.out.println(result); // true
    }
}
