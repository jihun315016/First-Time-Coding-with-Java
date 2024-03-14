package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExampleV1 {
    private static final String KEY_FR = "프랑스";
    private static final String KEY_EN = "영국";

    public static void main(String[] args) {
        Map<String, String> capitalMap = prepareCapitalMap();

        System.out.println(capitalMap);

        // remove()
        // 존재하지 않는 키를 제거해도 오류가 발생하지 않는다.
        capitalMap.remove(KEY_FR);
        capitalMap.remove(KEY_EN);
        System.out.println("영국 제거 후 : " + capitalMap);
        
        // keySet()
        Set<String> keySet = capitalMap.keySet();
        for (String key : keySet) {
            System.out.println("키 : " + key);
        }

        //containKey()
        boolean hasFranceKey = capitalMap.containsKey(KEY_FR);
        boolean hasEnglandKey = capitalMap.containsKey(KEY_EN);
        System.out.println(KEY_FR + " 키 존재? " + hasFranceKey);
        System.out.println(KEY_EN + " 키 존재? " + hasEnglandKey);

        // clear()
        capitalMap.clear();
        System.out.println("clear() 후 : " + capitalMap);
        System.out.println("isEmpty()? " + capitalMap.isEmpty());
    }

    public static Map<String, String> prepareCapitalMap() {
        Map<String, String> map = new HashMap<>();
        map.put("대한민국", "서울");
        map.put("미국", "워싱턴DC");
        map.put("스웨덴", "스톡홀름");
        map.put("영국", "런던");
        return map;
    }
}
