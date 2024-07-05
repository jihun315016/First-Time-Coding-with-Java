package exam.http;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class UrlParamParser {
    public static void main(String[] args) {
        String str = spacingprocessing("Hello World");
        System.out.println(str);
        // Hello%20World

        Map<String, String> map = new HashMap<>();
        map.put("a", "hello");
        map.put("b", "world");
        map.put("c", "5000");

        String urlParam = getUrlParameterFormat(map);
        System.out.println(urlParam);
        // a=hello&b=world&c=5000
    }

    public static String spacingprocessing(String str) {
        String[] strArray = str.split(" ");
        return String.join("%20", strArray);
    }

    public static String getUrlParameterFormat(Map<String, String> map) {
        Iterator<String> keys = map.keySet().iterator();
        String strKey, strValue;
        List<String> list = new ArrayList<>();

        while (keys.hasNext()) {
            strKey = keys.next();
            strValue = map.get(strKey);
            list.add(strKey + "=" + strValue);
        }

        return String.join("&", list);
    }
}
