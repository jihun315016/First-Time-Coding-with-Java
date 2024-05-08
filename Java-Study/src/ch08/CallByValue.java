package ch08;

public class CallByValue {
    public static void main(String[] args) {
        int val1 = 100;
        CallByValue a = new CallByValue();
        int result = a.increse(val1);
        System.out.println("val1 : " + val1 + ", result : " + result);
    }

    public int increse(int val) {
        val++;
        return val;
    }
}
