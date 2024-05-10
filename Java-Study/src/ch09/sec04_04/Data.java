package ch09.sec04_04;

public class Data {
    private int x, y;
    private int value;

    public Data(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setValue() {
        value = x + y;
    }

    public int getValue() {
        return value;
    }
}
