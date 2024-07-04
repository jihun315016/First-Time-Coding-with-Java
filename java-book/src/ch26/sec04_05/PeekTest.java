package ch26.sec04_05;

import java.util.List;
import java.util.Arrays;

public class PeekTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "Banana", "apple", "mango", "strawberry");

        list.stream()
            .distinct()
            .filter(l -> l.length() > 3)
            .peek(l -> System.out.println(l + "/"))
            .filter(l -> l.startsWith("B"))
            .peek(l -> System.out.println(l + "~"))
            .forEach(System.out::println);
    }
}
