package ch09.sec05_01;

public class CarTest {
    public static void main(String[] args) {
        Sedan myCar = new Sedan("아반떼", "11가 1111", "은색", 60, 2000);
        Truck truck = new Truck("1톤 포터", "22나 2222", "청색", 3000, 20, 1000);
        Bus bus = new Bus("1001번 버스", "33다 3333", "노란색", 4000, 60, 20, 1000);

        System.out.println(myCar.getCarInfo());
        System.out.println(truck.getCarInfo());
        System.out.println(bus.getCarInfo());

        truck.speedUp(10);
        truck.carryLoad();

        bus.ridePassenger();

        System.out.println(truck.getCarInfo() + ", 적재량 : " + truck.getLoad() + "톤");
        System.out.println(bus.getCarInfo() + ", 승객 수 : " + bus.getPassenger() + "명, 승차 요금 : " + bus.getFee() + "원");
    }
}
