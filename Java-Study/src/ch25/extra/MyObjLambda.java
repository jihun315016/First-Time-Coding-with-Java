package ch25.extra;

public class MyObjLambda {
    public static void main(String[] args) {
        MyObjInterface myInterface = (len) -> new int[len];
        int[] arr = myInterface.getIntegerArray(5);

        for(int i = 1; i < 6; i++) {
            arr[i - 1] = i;
        }

        for(int a : arr) {
            System.out.println(a);
        }
    }
}

@FunctionalInterface
interface MyObjInterface {
    int[] getIntegerArray(int len);
}

