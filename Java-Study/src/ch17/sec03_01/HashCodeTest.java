package ch17.sec03_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashCodeTest {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("kim", 82);
        hashMap.put("lee", 70);
        hashMap.put("park", 75);

        Iterator iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
