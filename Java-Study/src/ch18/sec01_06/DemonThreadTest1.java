package ch18.sec01_06;

public class DemonThreadTest1 {
    public static void main(String[] args) {
        Thread house = new Horse(1);
        house.setDaemon(true);
        house.start();
    }
}
