package ch17.sec01_03;

import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("kim");
        arrayList.add("lee");
        arrayList.remove(1);
        System.out.println(arrayList);
    }
}
