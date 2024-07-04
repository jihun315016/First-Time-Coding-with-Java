package ch09.sec05_01;

public class Bus extends Car {
    private int passenger;
    private int fee;

    public Bus(String carName, String carNumber, String carColor, int carSize, int velocity, int passenger, int fee) {
        super.carName = carName;
        super.carNumber = carNumber;
        super.carColor = carColor;
        super.velocity = velocity;
        super.carSize = carSize;
        this.passenger = passenger;
        this.fee = fee;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public void ridePassenger() {
        if (passenger > 0) {
            passenger++;
            fee = fee + 100;
        }
    }
}
