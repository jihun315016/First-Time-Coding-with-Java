package ch18.sec01_03;

public class Blue implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("청기 올려!");
        }
    }
}
