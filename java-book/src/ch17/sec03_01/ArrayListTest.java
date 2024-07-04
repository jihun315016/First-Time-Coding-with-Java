package ch17.sec03_01;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Java");

        for (String item : arrayList) {
            System.out.println(item);
        }
    }
}
