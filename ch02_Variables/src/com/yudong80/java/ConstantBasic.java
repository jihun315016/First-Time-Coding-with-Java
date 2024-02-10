package com.yudong80.java;

public class ConstantBasic {
    // 자바에서 상수 이름은 대문자와 언더스코어(_)만 사용한다.
    static final double PI = 3.14159236;
    static final int MAX_COUNT = 100;

    public static void main(String[] args)
    {
        final int MAX_INTEGER = Integer.MAX_VALUE;

        System.out.println("상수 PI : " + PI);
        System.out.println("최대 개수 : " + MAX_COUNT);
        System.out.println("최대 int 값 : " + MAX_INTEGER);
    }
}
