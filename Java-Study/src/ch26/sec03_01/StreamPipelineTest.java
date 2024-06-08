package ch26.sec03_01;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import ch26.Student;

import java.util.stream.IntStream;

public class StreamPipelineTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(); 

        list.add(new Student("홍길동", 2, 80));
        list.add(new Student("이순신", 3, 99));
        list.add(new Student("손흥민", 1, 85));
        list.add(new Student("차범근", 3, 90));
        list.add(new Student("임꺽정", 3, 75));

        OptionalDouble optionalDouble = list.stream()
            .filter(s -> s.getGrade() == 3)
            .mapToInt(Student::getScore)
            .average();
            
        System.out.println(optionalDouble.getAsDouble());
    }
}
