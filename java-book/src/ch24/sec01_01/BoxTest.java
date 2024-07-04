package ch24.sec01_01;

import java.util.List;
import java.util.Arrays;

public class BoxTest {
    public static void main(String[] args) {
        Box<Person> box = new Box<>();

        // Person 상속 받는 하위 클래스만 들어올 수 있음
        // 이런거 안 됌
        // Box<String> box = new Box<>();

        box.setData(new Person("흥민"));
        System.out.println(box.getData());
        
        box.setData(new Student("길동", 2));
        System.out.println(box.getData());
        
        box.setData(new Employee("노동", 20));
        System.out.println(box.getData());

        List<Integer> list = Arrays.asList(1, 2, 3);
        // for 문이 문제가 아니라 파라미터 넘기는 게 문제
        // printData(list);
        for (Object e : list) {
            System.out.println(e);
        }
        
    }

    // public static void printData(List<Object> arr) {
    //     for (Object e : arr) {
    //         System.out.println(e);
    //     }
    // }

    public static<T> void printData(List<T> arr) {
        for (Object e : arr) {
            System.out.println(e);
        }
    }
}
