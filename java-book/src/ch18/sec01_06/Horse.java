package ch18.sec01_06;

public class Horse extends Thread {
    private int horseNum;

    public Horse(int horseNum) {
        this.horseNum = horseNum;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try { Thread.sleep(200); } catch (InterruptedException e) { }
            System.out.println(horseNum + "번 말 " + (100 * i) + "미터 통과");
        }
        System.out.println(horseNum + "번 말이 결승선 도착");
    }
}
