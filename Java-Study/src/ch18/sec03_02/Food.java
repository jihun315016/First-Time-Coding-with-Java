package ch18.sec03_02;

public class Food {
    // 음식 메뉴를 배열로 선언
    private static String[] menu = {"돈까스", "오므라이스", "된장찌개", "육개장"};
    String foodName;

    public Food() { }

    public synchronized void receiveOrder() {
        System.out.println("웨이터가 손님에게 주문을 받습니다.");
        int menuNum = (int)(Math.random() * 3);
        this.foodName = menu[menuNum];

        System.out.println("웨이터가 " + this.foodName + "주문을 주방에 전달합니다.");
        System.out.println();
    }

    public synchronized void makeFood() {
        System.out.println("주방장이 " + this.foodName + "을 만듭니다.");
        
        System.out.println("주방장이 " + foodName + "을 다 만들었습니다.");
        System.out.println();
    }
}
