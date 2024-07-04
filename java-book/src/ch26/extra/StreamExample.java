package ch26.extra;

import java.util.List;
import java.util.Arrays;

class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "strawberry");
        list.stream()
            .filter(l -> l.length() > 5)
            .peek(l -> System.out.println("l.length() > 5 : " + l))
            .filter(l -> l.startsWith("b"))
            .peek(l -> System.out.println("l.startsWith : " + l))
            .forEach(l -> System.out.println(l));

            // l.length() > 5 : banana
            // l.startsWith : banana
            // banana
            // l.length() > 5 : strawberry
        
            // 각 요소는 개별적으로 중간 연산과 최종 연산이 수행된다.
    }
}
