public class CarRace {

    private static final int CAR_MAX = 3;

    private Car[] cars;

    public CarRace()
    {
        registerCars();
    }

    private void registerCars()
    {
        cars = new Car[CAR_MAX];
        for (int i = 0; i < cars.length; i++)
        {
            String carNnumber = "SKY-" + i + 1;
            cars[i] = new Car(carNnumber);
        }
    }

    public void start()
    {
        for (Car car : cars)
        {
            car.start();
        }
    }

    public static void main(String[] args) 
    {
        CarRace race = new CarRace();
        race.start();
    }
}
