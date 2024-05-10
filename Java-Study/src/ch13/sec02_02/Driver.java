package ch13.sec02_02;

public class Driver {
    private Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public void drive() {
        car.speedUp();
        car.speedDown();
        car.stop();
    }

    public void truckDrive() {
        Car car = new Truck();
        car.speedUp();
        car.speedDown();
        car.stop();
    }

    public void speedUp(Car car) {
        if (car instanceof Truck) {
            Truck truck = (Truck)car;
            truck.speedUp();
        }
    }
}
