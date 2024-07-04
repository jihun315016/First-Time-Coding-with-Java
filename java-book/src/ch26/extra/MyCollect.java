package ch26.extra;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MyCollect {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5 };

        // boxed : IntStream같은 타입을 Stream 클래스로 변환
        List<Integer> list = Arrays.stream(intArray)
            .boxed() 
            .collect(Collectors.toList());
    }
}
