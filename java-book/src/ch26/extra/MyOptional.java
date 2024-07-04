package ch26.extra;

import java.util.List;
import java.util.ArrayList;
import java.util.OptionalDouble;

public class MyOptional {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        OptionalDouble optionalDouble = getAverage(numberList);

        double average = getAverage(numberList).orElse(0);
        System.out.println(average);

        boolean isAverage = getAverage(numberList).isPresent();
        System.out.println(isAverage);

        // 실행 안됨
        getAverage(numberList).ifPresent(a -> System.out.println("exist"));
    }

    // OptionalDouble 클래스는 null이 반환되어도
    // 예외가 발생하지 않는다.
    public static OptionalDouble getAverage(List<Integer> list) {
        return list.stream().mapToInt(s -> s).average();
    }
}
