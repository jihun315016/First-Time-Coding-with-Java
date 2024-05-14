package ch17.sec05_01;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMethodTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("차범근");
        treeSet.add("차범근");
        treeSet.add("김메시");
        treeSet.add("손흥민");

        // [김메시, 손흥민, 차범근]
        System.out.println(treeSet);

        // 김메시
        System.out.println(treeSet.first());

        // 차범근
        System.out.println(treeSet.last());

        // 오른차순
        Iterator iterator1 = treeSet.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        // 내림차순
        Iterator iterator2 = treeSet.descendingIterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
