package ch25.sec02_01;

public class InstanceMethodRefTest2 {
    public static void main(String[] args) {
        MyMath2 myMath = new MyMath2();
        MyFuncInterface2 mfi3 = System.out::println;
        mfi3.methodA(10);

        mfi3 = myMath::print;
        mfi3.methodA(3);
    }
}

@FunctionalInterface
interface MyFuncInterface2 {
    void methodA(int k);    
}

class MyMath2 {
    public void print(int k) {
        System.out.println(k);
    }
}