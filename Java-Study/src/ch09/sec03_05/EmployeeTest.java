package ch09.sec03_05;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee hong, lee;
        lee = new Regular("이순신", 1000, 500);
        hong = new Temp("홍길동", 1000, 500, 10);

        System.out.println("사원 정보 출력");
        System.out.println(lee.calcTotalPay());

        System.out.println();

        System.out.println("사원 정보 출력");
        System.out.println(hong.calcTotalPay());
    }
}
