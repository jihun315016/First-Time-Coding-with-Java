package ch09.sec04_04;

public class DataTest {
    public static void main(String[] args) {
        Data d = new Data(2, 5);

        d.setValue();
        System.out.println("value : " + d.getValue());
    }
}
