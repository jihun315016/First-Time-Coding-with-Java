package ch26.sec05_04;

import ch26.Student;

import java.util.ArrayList;
import java.util.List;

public class ReduceTest {
    public static void main(String[] args) {
        // 리덕션(Reduction) : 대량의 데이터를 가공하여 결과를 구하는 과정
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 2, 80));
        list.add(new Student("이순신", 3, 100));
        list.add(new Student("손흥민", 1, 85));

        int total1 = list.stream()
            .mapToInt(Student::getScore)
            .reduce((a, b) -> a + b)
            .getAsInt();
        System.out.println(total1);
        // reduce : 순차적으로 두 개의 요소를 받아 하나의 값으로 결합하는 메서드

        Student bestScoreStudent = list.stream()
            .reduce((a, b) -> a.getScore() > b.getScore() ? a : b)
            .get();
        
        // 이순신
        System.out.println(bestScoreStudent.getName());
    }
}
