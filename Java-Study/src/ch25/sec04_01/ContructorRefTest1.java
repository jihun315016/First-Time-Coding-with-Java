package ch25.sec04_01;

class ConstructorRefTest1 {
    public static void main(String[] args) {
        MyFuncInterface mfi1 = new MyFuncInterface() {
            @Override
            public MyMath methodA() {
                return new MyMath();
            }
        };

        MyMath myMath1 = new MyMath();
        myMath1.print(10, 20);

        MyFuncInterface mfi2 = () -> new MyMath(2);
        MyMath myMath2 = mfi2.methodA();
    }
}

@FunctionalInterface
interface MyFuncInterface {
    MyMath methodA();
}

class MyMath {
    public MyMath() {
        System.out.println("기본");
    }

    public MyMath(int a) {
        System.out.println("매개변수 하나");
    }

    public void print(int a, int b) {
        System.out.println(a + b);
    }
}