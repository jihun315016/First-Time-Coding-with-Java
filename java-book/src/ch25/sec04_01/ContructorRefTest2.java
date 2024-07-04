package ch25.sec04_01;

public class ContructorRefTest2 {
    public static void main(String[] args) {
        // MyMath 기본 생성자를 참조해해서 MyMath 객체 리턴
        MyFuncInterface mfi3 = MyMath::new;
        MyMath math = mfi3.methodA();
        math.print(2, 8);
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