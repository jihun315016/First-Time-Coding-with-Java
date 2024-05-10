package ch12.sec03_01;

// 클래스명에 final을 지정하면 그 클래스의 멤버는 더 이상 자식 클래스에서 접근할 수 없다.
// 상속 시 에러 발생 => 상속할 수 없다.
public final class Car {
    protected int carNum;
    protected String carName;
    protected int valocity;
}
