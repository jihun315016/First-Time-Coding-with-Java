package ch26.sec05_05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ch26.Student;

public class CollectorTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 2, 80));
        list.add(new Student("이순신", 3, 100));
        list.add(new Student("손흥민", 1, 85));

        // 결과를 컬렉션으로 가져오기
        List<Student> filtered = list.stream()
            .filter(l -> l.getScore() > 80)
            .collect(Collectors.toList());
        
        filtered.forEach(f -> System.out.println(f.getName()));
    }    
}
