package ch17.sec01_03;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;;

public class LinkedListTest {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);


        // 동기화된 리스트 생성 (스레드 안전을 보장하는 리스트)
        List<Integer> synchronizedList = Collections.synchronizedList(linkedList);

        // 동기화된 접근을 제공하는 동기화 블록 
        // 추가나 삭제에 대해서는 자동으로 동기화되지만
        // 조회는 그렇지 않으므로 이렇게 블록 안에서 작업해야 한다.
        synchronized (synchronizedList) {
            for (int item : synchronizedList) {
                System.out.println(item);
            }
        }
    }
}
