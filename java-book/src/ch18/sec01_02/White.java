package ch18.sec01_02;

public class White extends Thread {
    @Override
    public void run() {
        while (true){
            System.out.println("백기 올려!");
        }
    }
}
