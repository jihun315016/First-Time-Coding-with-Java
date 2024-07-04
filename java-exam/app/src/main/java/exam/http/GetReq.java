package exam.http;

import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

class GetReq {
    private static final String URL = "http://www.aladin.co.kr/ttb/api/ItemLookUp.aspx?ttbkey=ttbrkdwl9601740001&itemIdType=ISBN&ItemId=9788954638746&output=js&Cover=Big&Version=20131101&OptResult=ebookList,usedList,reviewList";
    private static final String METHOD = "GET";
    private static final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) throws IOException {
        // URL 연결 객체 가져오기
        URL url = new URL(URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // 요청 메서드, 헤더 설정
        connection.setRequestMethod(METHOD);
        connection.setRequestProperty("User-Agent", USER_AGENT); 

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