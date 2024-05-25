package ch25.extra;

public class MyLambda {
    public static void main(String[] args) {
        MyInterface1 lambda1;

        // 가장 기본적인 람다 구현
        lambda1 = new MyInterface1() {
            @Override
            public void printData(int data) {
                System.out.println(data);
            }
        };
        lambda1.printData(3);

        // 한 줄인 경우 중괄호 생략 가능
        // 매개변수에서 타입 생략 가능(int a)
        // 매개변수가 하나인 경우 소괄호 생략 가능(a)
        lambda1 = data -> System.out.println(data);
        lambda1.printData(10);


        MyInterface2 lambda2;

        // 실행문이 한 줄이면 return 생략 가능
        lambda2 = (num1, num2) -> num1 + num2;
    }
}

// 추상 메서드가 하나만 선언되었는지 체크하는 애너테이션
@FunctionalInterface
interface MyInterface1 {
    public void printData(int data);
}

@FunctionalInterface
interface MyInterface2 {
    public int returnSum(int num1, int num2);
}
