package ch25.sec01_01;

public class LambdaExpressionTest3 {
    public static void main(String[] args) {
        MyFuncInterface3 mfi1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println(mfi1.mehtodC(2, 3));

        MyFuncInterface3 mfi2 = (a, b) -> a + b;
        System.out.println(mfi2.mehtodC(3, 6));
    }
}

// 추상 메서드가 하나만 선언되었는지 확인할 수 있는 애너테이션
@FunctionalInterface
interface MyFuncInterface3 {
    public int mehtodC(int a, int b);
}
