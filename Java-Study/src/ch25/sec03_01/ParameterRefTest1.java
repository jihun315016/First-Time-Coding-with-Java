package ch25.sec03_01;

public class ParameterRefTest1 {
    public static void main(String[] args) {
        MyFucnInterface mfi1 = new MyFucnInterface() {
            @Override
            public void methodA(MyMath myMath, int a, int b) {
                myMath.print(a, b);
            }
        };
        mfi1.methodA(new MyMath(), 5, -3);

        MyFucnInterface mfi2 = (myMath, a, b) -> {
            myMath.print(a, b);
        };
        mfi2.methodA(new MyMath(), 3, 5);
    }
}

@FunctionalInterface
interface MyFucnInterface {
    void methodA(MyMath myMath, int a, int b);
}

class MyMath {
    public void print(int a, int b) {
        System.out.println(a + b);
    }
}
