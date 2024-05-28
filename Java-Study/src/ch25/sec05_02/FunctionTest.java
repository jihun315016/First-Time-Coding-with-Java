package ch25.sec05_02;

import java.util.function.Function;
import java.util.function.BiFunction;

public class FunctionTest {
    public static void main(String[] args) {
        // (실습 생략)
        // Supplier는 get 이름의 추상 메서드를 가진다.

        Function<Integer, String> function = (num) -> "입력 : " + num;
        String rStr = function.apply(5);
        System.out.println(rStr);
    }
}
