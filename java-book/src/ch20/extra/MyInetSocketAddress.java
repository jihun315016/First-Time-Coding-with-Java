package ch20.extra;

import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.net.InetAddress;

public class MyInetSocketAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetSocketAddress inetSocketAddress;
        String host = "www.naver.com";
        int port = 9999;
        
        // // IP 주소 없이 포트 번호만 지정
        // 0.0.0.0/0.0.0.0:9999
        inetSocketAddress = new InetSocketAddress(port);
        System.out.println(inetSocketAddress);

        // IP 정보와 포트 번호 지정
        // www.naver.com/223.130.200.236:9999
        InetAddress inetAddress = inetSocketAddress.getAddress();
        inetSocketAddress = new InetSocketAddress(inetAddress, port);
        System.out.println(inetSocketAddress);

        // IP 문자열과 포트 번호 지정
        inetSocketAddress = new InetSocketAddress(host, port);


        // --------------------------------------------------


        // www.naver.com
        System.out.println(inetSocketAddress.getHostName());

        // 9999
        System.out.println(inetSocketAddress.getPort());
    }
}
