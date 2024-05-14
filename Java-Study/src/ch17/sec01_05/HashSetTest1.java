package ch17.sec01_05;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");

        set.remove("C");
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
