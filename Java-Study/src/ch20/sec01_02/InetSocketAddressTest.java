package ch20.sec01_02;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class InetSocketAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        // InetAddress는 IP 주소만 관리할 수 있지만
        // SocketAddress 클래스는 InetAddress 기능을 그대로 제공하면서 
        // 포트 번호 관리 기능도 함께 제공한다.

        InetAddress addr1 = InetAddress.getByName("www.naver.com");
        int port = 9999;

        // IP 주소 없이 포트 번호만 지정
        // 0.0.0.0/0.0.0.0:9999
        InetSocketAddress isa1 = new InetSocketAddress(port);

        // IP 주소와 포트 번호 지정
        // www.naver.com/223.130.200.219:9999
        InetSocketAddress isa2 = new InetSocketAddress("www.naver.com", port);

        // IP 주소와 포트 번호 지정
        // www.naver.com/223.130.200.219:9999
        InetSocketAddress isa3 = new InetSocketAddress(addr1, port);

        System.out.println(addr1);
        System.out.println(isa1);
        System.out.println(isa2);
        System.out.println(isa3);

        InetAddress ina = isa2.getAddress();
        System.out.println(ina); // www.naver.com/223.130.192.247
        System.out.println(isa2.getHostName()); // www.naver.com
        System.out.println(isa2.getPort()); // 9999
    }
}
