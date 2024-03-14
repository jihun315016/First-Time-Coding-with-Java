package KDelivery;

class Shop {    
    private static final int FOOD_MAX = 10; // 음식 개수는 최대 10개
    private static final String EMPTY_FOOD = "";
    private static final int EMPTY_PRICE = 0;

    // 음식점 상호
    private String shopName;

    // 배달 음식
    private String[] foodNames;

    // 음식 가격
    private int[] prices;

    public Shop(String shopName) {
        this.shopName = shopName;
        initValues();
    }

    private void initValues() {
        foodNames = new String[FOOD_MAX];
        prices = new int[FOOD_MAX];

        for (int i = 0; i < FOOD_MAX; ++i) {
            foodNames[i] = EMPTY_FOOD;
            prices[i] = EMPTY_PRICE;
        }
    }

    // 자바 주석 방식인데 "자바독"이라고 부름
    /**
     * 가맹점 음식 추가
     * @param idx 인덱스
     * @param name 음식 이름
     * @param price 음식 가격
     */
    public void addFood(int idx, String name, int price) {
        System.out.println(shopName + "에 음식(" + name + ", " + price + ") 추가되었습니다.");
        foodNames[idx] = name;
        prices[idx] = price;
    }
}