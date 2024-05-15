package ch15.sec07_03;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

		System.out.println(Calendar.YEAR); // 1

        // 연 월 일
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH) + 1);  // 월은 0부터 시작
		System.out.println(calendar.get(Calendar.DATE));

        // 시 분 초
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));

        // 요일 구하기
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        switch (week) {
            case Calendar.MONDAY:
                System.out.println("월요일");
                break;
            case Calendar.TUESDAY:
                System.out.println("화요일");
                break;
            default:
                System.out.println("월요일도 화요일도 아님");
                break;
        }
    }
}
