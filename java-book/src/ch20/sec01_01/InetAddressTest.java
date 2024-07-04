package ch20.sec01_01;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        // InetAddress는 IP 주소(호스트명)와 관련된 기능을 제공

        // 호스트명과 해당 IP 주소 저장 후 객체 리턴
        InetAddress addr1 = InetAddress.getByName("www.naver.com");

        // 입력한 IP 주소 저장 후 객체 리턴
        InetAddress addr2 = InetAddress.getByAddress(new byte[] {
            (byte)223, (byte)130, (byte)192, (byte)247
        });

        // 호스트명과 입력한 IP 주소 저장 후 객체 리턴
        InetAddress addr3 = InetAddress.getByAddress("www.naver.com", new byte[] {
            (byte)223, (byte)130, (byte)192, (byte)247
        });

        System.out.println(addr1); // www.naver.com/223.130.192.247
        System.out.println(addr2); // /223.130.192.247
        System.out.println(addr3); // www.naver.com/223.130.192.247

        // 로컬 호스트 이름을 확인하고 매핑되는 IP 주소를 가져온다.
        InetAddress addr4 = InetAddress.getLocalHost();

        // 루프백 IP : 자기 자신을 가리키는 IP 주소
        InetAddress addr5 = InetAddress.getLoopbackAddress();

        System.out.println(addr4); // 77106997-PC/192.168.0.23
        System.out.println(addr5); // localhost/127.0.0.1

        // [www.naver.com/223.130.200.219, www.naver.com/223.130.192.247, www.naver.com/223.130.200.236, www.naver.com/223.130.192.248]
        // 부하와 지리적인 분산, 장애 복구와 같은 이유로 여러 IP를 가질 수 있다.
        InetAddress[] addr6 = InetAddress.getAllByName("www.naver.com");
        System.out.println(Arrays.toString(addr6));
    }
}
