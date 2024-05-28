package ch25.sec05_02;

import java.util.function.Predicate;
import java.util.function.BiPredicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = (name) -> name == "길동";
        System.out.println("이름은 길동? " + predicate.test("Hello"));

        BiPredicate<String, String> biPredicate = (str1, str2) -> str1 == str2;
        System.out.println("문자열 -> " + biPredicate.test("a", "a"));
    }
}
