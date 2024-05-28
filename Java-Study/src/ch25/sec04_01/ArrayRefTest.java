package ch25.sec04_01;

public class ArrayRefTest {
    public static void main(String[] args) {
        MyFuncInterface2 mfi1 = new MyFuncInterface2() {
            @Override
            public int[] methodA(int len) {
                return new int[len];
            }
        };

        // :: 기호로 생성자를 참조한다.
        int[] arr1 = mfi1.methodA(5);
        System.out.println(arr1.length);

        MyFuncInterface2 mfi2 = (len) -> new int[len];
        int[] arr2 = mfi2.methodA(3);
        System.out.println(arr2.length);

        MyFuncInterface2 mfi3 = int[]::new;
        int[] arr3 = mfi3.methodA(7);
        System.out.println(arr3.length);
    }
}

@FunctionalInterface
interface MyFuncInterface2 {
    int[] methodA(int len);
}
