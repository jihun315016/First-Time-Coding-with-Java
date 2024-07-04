package ch26.sec04_02;

import java.util.ArrayList;
import java.util.List;

class MapXXXTest {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 2, 70));
        studentList.add(new Student("차범근", 3, 90));
        studentList.add(new Student("이순신", 2, 100));

        studentList.stream()
            .map(element -> element.getName() + " " + element.getScore() + "점")
            .forEach(item -> System.out.println(item));
            
        // 홍길동 70점
        // 차범근 90점 
        // 이순신 100점
    }
}

