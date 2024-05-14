package ch18.sec03_01;

public class Restaurant {
    public static void main(String[] args) {
        Food food = new Food();
        Waiter waiter = new Waiter(food);
        Chef chef = new Chef(food);
        
        waiter.start();
        chef.start();
    }
}
