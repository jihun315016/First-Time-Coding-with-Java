package ch25.sec01_01;

public class LambdaExpressionTest1 {
    public static void main(String[] args) {
        // 자바는 클래스 기반으로 기능을 구현한다.
        // 따라서 어떤 기능(함수)는 반드시 클래스 내에서 메서드로 구현해야 한다.
        // 그러나 람다식은 함수 형식으로 작성해야 하므로 자바에선 람다식을 익명 객체를 이용해서 구현한다.

        // 람다식으로 구현하는 메서드는 인터페이스의 추상 메서드이어야 한다.
        // 그러나 람다식으로 구현하는 추상 메서드를 가지는 인터페이스는 한 개의 추상 메서드만 가져야 한다.
        // 즉, 한 개의 추상 메서드를 가지는 인터페이스를 함수형 인터페이스라고 한다.

        MyFuncInterface mfi1 = () -> {
            System.out.println("methodA() 호출 1");
        };
        mfi1.methodA();

        // 실행문이 한 개인 경우 중관호를 생략할 수 있다.
        MyFuncInterface mfi2 = () -> System.out.println("methodA() 호출 2");
        mfi2.methodA();
    }
}

interface MyFuncInterface {
    public void methodA();
}
