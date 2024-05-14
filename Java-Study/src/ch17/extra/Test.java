package ch17.extra;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
