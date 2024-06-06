package ch25.sec06_01;

import java.util.function.Function;

class FunctionAndThenComposeTest {
    public static void main(String[] args) {
        Student student = new Student("홍길동", 2, new Address("대한민국", "서울시"));

        Function<Student, Address> functionA = (s) -> s.getAddress();
        Function<Address, String> functionB = (a) -> a.getCity();

        // Consumer, Function, Operator 함수형 인터페이스에 해당되는 메서드
        // 함수형 인터페이스의 메서드 -> andThen, compose

        // 현재 함수(functionA)의 출력을 다음 함수(functionB)의 입력으로 연결한다.
        // functionA.apply로 Address 객체를 반환하고 그 객체를 functionB apply 메서드의 입력으로 넣는다.
        Function<Student, String> functionAB = functionA.andThen(functionB);
        String city1 = functionAB.apply(student);
        System.out.println(city1); // 서울시

        // 다음 함수(functionA)의 출력을 현재 함수(functionB)의 입력으로 연결한다.
        Function<Student, String> functionBA = functionB.compose(functionA);
        String city2 = functionBA.apply(student);
        System.out.println(city2); // 서울시
    }
}