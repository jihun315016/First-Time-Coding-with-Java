    package exam.http;

import java.net.URL;

import exam.http.models.ItemListCondition;
import exam.http.models.RequestData;
import lombok.Value;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.util.Map;
import java.util.HashMap;

import java.lang.reflect.Field;

class GetReq {
    private static String apiKey = "";
    
    private static String itemNewAll = "ItemNewAll";

    private String bestSeller = "BestSeller";

    public static void main(String[] args) throws IOException {
        ItemListCondition itemListCondition = ItemListCondition.builder()
            .ttbkey(apiKey)
            .queryType(itemNewAll)
            .maxResult(2)
            .start(1)
            .searchTarget("Book")
            .output("js")
            .version("20131101")
            .build();

        Map<String, String> map = new HashMap<>();
        Object value;
        for (Field field : itemListCondition.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                value = field.get(itemListCondition);
                map.put(field.getName(), value != null ? value.toString() : "");
                
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        System.out.println(map);
        
        String urlParam =  UrlParamParser.getUrlParameterFormat(map);
        String baseUrl = "http://www.aladin.co.kr/ttb/api/ItemList.aspx?";

        RequestData requestData = RequestData.builder()
            .url(baseUrl + urlParam)
            .method("GET")
            .userAgent("Mozilla/5.0")
            .build();

        // URL 연결 객체 가져오기
        URL url = new URL(requestData.getUrl());
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // 요청 메서드, 헤더 설정
        connection.setRequestMethod(requestData.getMethod());
        connection.setRequestProperty("User-Agent", requestData.getUserAgent()); 

        // 응답 코드 가져오기, 성공 시 200 반환
        int responseCode = connection.getResponseCode();

        // 응답 데이터를 읽을 수 있는 InputStream 객체 가져오기
        InputStream InputStream = connection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(InputStream, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String inputLine;

        System.out.println("responseCode : " + responseCode);
        while ((inputLine = bufferedReader.readLine()) != null) {
            System.out.println(inputLine);
            System.out.println();
        }
    }
}