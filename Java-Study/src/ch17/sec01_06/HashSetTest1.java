package ch17.sec01_06;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        set.add(new Student("1234", "홍길동"));
        set.add(new Student("1234", "홍길동"));
        set.add(new Student("5678", "홍길동"));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // (1234 / 홍길동)
        // (5678 / 홍길동)
    }
}
