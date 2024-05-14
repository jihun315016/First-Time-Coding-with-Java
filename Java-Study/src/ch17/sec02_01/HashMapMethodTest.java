package ch17.sec02_01;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

import ch17.sec01_06.Student;

public class HashMapMethodTest {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();

        // Student 클래스는 Set 자료구조를 참고한다.
        map.put(new Student("1234", "홍길동"), "3학년");
        map.put(new Student("1234", "홍길동"), "3학년");
        map.put(new Student("5678", "김길동"), "2학년");

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }
        // 3학년
        // 2학년
    }
}
