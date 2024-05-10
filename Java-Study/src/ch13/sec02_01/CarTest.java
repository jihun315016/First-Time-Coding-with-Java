package ch13.sec02_01;

public class CarTest {
    public static void main(String[] args) {
        Car c = new Truck();
        Truck t = new Truck();

        System.out.println("모든 차의 안전 속도 : " + c.SAFE_SPEED);
        t.speedUp();
        t.speedDown();
        t.stop();
    }
}
