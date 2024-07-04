package ch26.sec04_02;

import java.util.Arrays;
import java.util.List;

public class FlatMapTest {
    public static void main(String[] args) {
        List<String> studentList = Arrays.asList("홍길동 2 80", "손흥민 2 88");
        studentList.stream()
            .flatMap(element -> Arrays.stream(element.split(" ")))
            .forEach(token -> System.out.println(token));
    }
}
