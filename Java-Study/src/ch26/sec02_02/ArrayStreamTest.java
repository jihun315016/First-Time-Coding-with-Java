package ch26.sec02_02;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamTest {
    public static void main(String[] args) {
        Student[] stdArr = {
            new Student("홍길동", 2),
            new Student("이순신", 3)
        };

        Stream<Student> stream = Arrays.stream(stdArr);
        stream.forEach(s -> System.out.println(s.getName() + " / " + s.getGrade()));
    }
}
