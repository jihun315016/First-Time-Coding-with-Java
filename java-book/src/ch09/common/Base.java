package ch09.common;

import java.util.Calendar;

public class Base {
    public void displayData(String data) {
        System.out.println("조회한 데이터는 " + data + " 입니다.");
    }

    public String showTime() {
        String date, time;

        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DATE);

        date = year + "-" + month + "-" + day;
        time = hour + "-" + min + "-" + sec;

        return date + " " + time;
    }
}
