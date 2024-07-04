package ch09.rent;

import java.util.Calendar;

public class RentCarApp {
    public static void main(String[] args) {
        Member member = new Member();
        member.regMember("lee", "1234", "이순신", "서울시 도봉구", "010-1111-1111");

        // 테스트
        Calendar calendar = Calendar.getInstance();
        System.out.println(Calendar.YEAR);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(1));

        // 월은 0부터 시작한다.
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(2) + 1);

        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(5));

        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(10));

        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(12));

        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(13));
    }
}
