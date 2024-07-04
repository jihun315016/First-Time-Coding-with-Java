package ch25.sec02_01;

public class InstanceMethodRefTest3 {
    public static void main(String[] args) {
        MyMath3 math3 = new MyMath3();
        MyFuncInterface3 mfi3 = math3::print;
        mfi3.methodA();
    }
}

@FunctionalInterface
interface MyFuncInterface3 {
    void methodA();    
}

class MyMath3 {
    public void print() {
        System.out.println("print() 메서드 호출");
    }
}