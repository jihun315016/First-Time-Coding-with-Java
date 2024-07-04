package ch09.sec05_01;

public class Truck extends Car {
    private int load;

    public Truck(String carName, String carNumber, String carColor, int carSize, int velocity, int load) {
        super.carName = carName;
        super.carNumber = carNumber;
        super.carColor = carColor;
        super.velocity = velocity;
        super.carSize = carSize;
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public void carryLoad() {
        if (load >= 0) {
            load++;
        }
        else {
            load = 0;
        }
    }
}
