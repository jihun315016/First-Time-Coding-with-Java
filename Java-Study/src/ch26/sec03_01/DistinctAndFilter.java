package ch26.sec03_01;

import java.util.List;
import java.util.Arrays;

class DistinctAndFilter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "apple", "banana", "apple", "mango");
        list.stream()
            .distinct()
            .forEach(l -> System.out.print(l + " "));
        // apple banana mango 

        System.out.println();

        list.stream()
            .distinct()
            .filter(l -> l.length() < 6)
            .forEach(System.out::println); // l -> System.out.print(l + " ")
        // forEach 안에는 Consumer<T> 타입의 함수형 인터페이스가 들어갈 것
    }   
}