public class Car {
    private static final int DEFAULT_ACCEL = 10;
    private final String SPEED_UNIT = "km/h";
    static final String DISTANCE_UNIT = "km";

    private String carNumber;
    private int speed = 0;
    private int distance = 0;

    public Car(String carNumber) 
    {
        this.carNumber = carNumber;
    }

    public void start()
    {
        System.out.println("차량[" + carNumber + "]에 시동을 겁니다.");
    }
}
