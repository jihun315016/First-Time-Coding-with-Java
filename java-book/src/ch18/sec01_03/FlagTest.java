package ch18.sec01_03;

public class FlagTest {
    public static void main(String[] args) {
        Blue blue = new Blue();
        White white = new White();

        Thread t1 = new Thread(blue);
        Thread t2 = new Thread(white);

        t1.start();
        t2.start();

        // Runnable 인터페이스로 구현한 클래스는 완전한 스레드 클래스가 아님
        // 단지 run() 메서드만 구현된 그냥 클래스
        // 따라서 run을 비동기로 실행해주는 start 메서드를 가지는 Thread 클래스한테 객체를 넘겨
        // 스레드의 기능을 수행하도록 한다.

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("이름이 없는 스레드 실행");
                }
            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("메인 스레드 실행");
        }
    }
}
