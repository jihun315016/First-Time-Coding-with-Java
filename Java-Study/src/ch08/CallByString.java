package ch08;

public class CallByString {
    public static void main(String[] args) {
        String address = "서울시 강남구";
        CallByString str = new CallByString();

        System.out.println("메서드 호출 전");
        System.out.println("address : " + address);

        // 문자열은 자바에서 가장 많이 사용되는 타입이므로
        // 쉽게 사용할 수 있게
        // 예외적으로 기본 타입처럼 동작하도록 만들었다.
        str.setAddress(address);
        System.out.println();
        System.out.println("메서드 호출 후");
        System.out.println("address : " + address);
    }

    public void setAddress(String addr) {
        addr = "수원시 장안구";
    }
}
