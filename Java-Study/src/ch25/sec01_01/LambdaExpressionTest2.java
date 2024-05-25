package ch25.sec01_01;

public class LambdaExpressionTest2 {    
    public static void main(String[] args) {
        MyFuncInterface2 mfi1 = (int a) -> {
            System.out.println(a);
        };
        mfi1.methodB(2);

        MyFuncInterface2 mfi2 = (a) -> System.out.println(a);
        mfi2.methodB(5);

        MyFuncInterface2 mfi3 = a -> System.out.println(a);
        mfi3.methodB(6);
    }
}

@FunctionalInterface
interface MyFuncInterface2 {
    public void methodB(int a);
}