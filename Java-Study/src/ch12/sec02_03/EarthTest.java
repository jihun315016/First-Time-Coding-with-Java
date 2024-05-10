package ch12.sec02_03;

public class EarthTest {
    public static void main(String[] args) {
        Earth e1 = Earth.getInstance();
        System.out.println(e1.earthMessage());

        Earth e2 = Earth.getInstance();
        System.out.println("e1 == e2 ?? => " + (e1 == e2));
    }
}
