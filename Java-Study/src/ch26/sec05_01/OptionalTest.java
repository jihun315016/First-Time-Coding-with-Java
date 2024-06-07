package ch26.sec05_01;

import ch26.Student;

import java.util.List;
import java.util.ArrayList;
import java.util.OptionalDouble;

public class OptionalTest {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        // NoSuchElementException
        // double scoreAvg = studentList.stream()
        //     .mapToInt(s -> s.getScore())
        //     .average()
        //     .getAsDouble();

        OptionalDouble scoreAvg = studentList.stream()
            .mapToInt(s -> s.getScore())
            .average();

        double scoreAvg2 = studentList.stream()
            .mapToInt(s -> s.getScore())
            .average()
            .orElse(0);
 
        System.out.println(scoreAvg); // OptionalDouble.empty
        System.out.println(scoreAvg2); // 0.0

        studentList.stream()
            .mapToInt(s -> s.getScore())
            .average()
            .ifPresent(a -> System.out.println(a));

        boolean b = studentList.stream()
            .mapToInt(s -> s.getScore())
            .average()
            .isPresent();

        System.out.println(b); // false
    }
}
