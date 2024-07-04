package ch17.sec05_04;

import java.util.TreeMap;
import java.util.Iterator;

public class TreeMethodTest {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();

        treeMap.put("한국", "서울");
        treeMap.put("일본", "도쿄");
        treeMap.put("중국", "베이징");

        // 내림차순
        Iterator iterator = treeMap.descendingKeySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
