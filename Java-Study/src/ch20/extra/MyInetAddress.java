package ch20.extra;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddress {
    // UnknownHostException, IOException -> 강제된 예외 처리
    public static void main(String[] args) throws UnknownHostException, IOException {
        // 호스트명과 해당 IP 주소 저장 후 객체 리턴
        InetAddress inetAddress;
        String host = "www.naver.com";
        byte[] ipAddress = new byte[] { (byte)223, (byte)130, (byte)192, (byte)247 };

        // 호스트명과 해당 IP 주소 저장 후 객체 반환
        // www.naver.com/223.130.192.247
        inetAddress = InetAddress.getByName(host);
        System.out.println(inetAddress); 

        // 입력한 IP 주소 저장 후 객체 반환
        // /223.130.192.247
        inetAddress = InetAddress.getByAddress(ipAddress);
        System.out.println(inetAddress);

        // 호스트명과 입력한 IP 주소 저장 후 객체 반환
        // www.naver.com/223.130.192.247
        inetAddress = InetAddress.getByAddress(host, ipAddress);
        System.out.println(inetAddress);


        // --------------------------------------------------

        
        // 로컬 호스트 이름을 확인하고 매핑되는 IP 주소를 가져온다.
        // myPC/192.168.0.23
        inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);

        // // 루프백 IP(자기 자신을 가리키는 IP 주소)
        // localhost/127.0.0.1
        inetAddress = InetAddress.getLoopbackAddress();
        System.out.println(inetAddress);

        // 2000 ms 이내에 접근 가능 여부
        boolean isReachable = inetAddress.isReachable(2000);
        System.out.println(isReachable);
    }
}
