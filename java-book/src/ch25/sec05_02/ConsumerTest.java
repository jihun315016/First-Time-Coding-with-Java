package ch25.sec05_02;

import java.util.function.Consumer;
import java.util.function.BiConsumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumer = name -> System.out.println("이름 : " + name);
        consumer.accept("길동");

        // 매개변수가 3개 이상인 경우는 개발자가 작접 구현해야 한다.
        BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println("이름/나이 : " + name + "/" + age);
        biConsumer.accept("길동", 5);
    }
}
