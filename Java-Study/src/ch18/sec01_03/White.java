package ch18.sec01_03;

public class White implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("백기 올려!");
        }
    }
}
