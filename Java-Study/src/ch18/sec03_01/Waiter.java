package ch18.sec03_01;

public class Waiter extends Thread {
    Food food;

    public Waiter(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            // 주문 받기
            food.receiveOrder();
        }
    }
}
