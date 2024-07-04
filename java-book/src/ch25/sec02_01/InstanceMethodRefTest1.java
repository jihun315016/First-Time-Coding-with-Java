package ch25.sec02_01;

public class InstanceMethodRefTest1 {
    public static void main(String[] args) {
        MyFuncInterface mfi1 = new MyFuncInterface() {
            @Override
            public void methodA() {
                MyMath myMath = new MyMath();
                myMath.print();
            };
        };
        mfi1.methodA();

        MyFuncInterface mfi2 = () -> {
            MyMath myMath = new MyMath();
            myMath.print();
        };
        mfi2.methodA();
    }
}

@FunctionalInterface
interface MyFuncInterface {
    void methodA();    
}

class MyMath {
    public void print() {
        System.out.println("print() 메서드 호출");
    }
}