package ch13.sec02_02;

public class DriverTest {
    public static void main(String[] args) {
        Driver driver1 = new Driver(new Truck());
        driver1.drive();
        driver1.speedUp(new Truck());
    }
}
