package ch26.extra;

import java.util.Arrays;
import java.util.List;

public class Flatten {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("국어 80", "수학 92", "영어 85");
        strList.stream()
            .flatMap(element -> Arrays.stream(element.split(" ")))
            .forEach(item -> System.out.print(item + " "));
        // 국어 80 수학 92 영어 85 
        
        // Arrays.stream
        // > 배열을 스트림으로 변환하기
    }
}
