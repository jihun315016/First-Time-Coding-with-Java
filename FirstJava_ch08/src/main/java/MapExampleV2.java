package main.java;

import java.util.HashMap;
import java.util.Map;

public class MapExampleV2 {
    public static void main(String[] args) {
        Map<String, String> capitalMap = MapExampleV1.prepareCapitalMap();

        // putAll()
        Map<String, String> others = new HashMap<>();
        others.put("프랑스", "파리");
        others.put("스페인", "마드리드");
        others.put("대한민국", "서울");
        capitalMap.putAll(others);
        System.out.println("putAll() 후 맵 : " + capitalMap);

        // putIfAbsent()
        capitalMap.putIfAbsent("프랑스", "파리");
        System.out.println("putIfAbsent() 후 맵 : " + capitalMap);
    }
}
