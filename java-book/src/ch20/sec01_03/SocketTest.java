package ch20.sec01_03;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) throws IOException {
        // Socket : TCP 통신에 사용
        // 원격지에 접속 요청 후, 데이터 통신 기능 제공
        Socket socket1 = new Socket();

        socket1.connect(new InetSocketAddress("www.naver.com", 80));
        System.out.println(socket1.getInetAddress() + ":" + socket1.getPort());
        // www.naver.com/223.130.200.219:80

        Socket socket2 = new Socket("www.naver.com", 80);
        System.out.println(socket2.getInetAddress() + ":" + socket2.getPort()); // www.naver.com/223.130.192.247:80
        System.out.println(socket2.getLocalAddress() + ":" + socket2.getLocalPort()); // /192.168.0.23:28151
        
        // 원격지 연결 시 로컬 IP 주소와 포트 번호를 원격지와 연결한다.
        // www.naver.com/223.130.192.247:80
        Socket socket3 = new Socket("www.naver.com", 80, InetAddress.getLocalHost(), 9999);
        System.out.println(socket3.getInetAddress() + ":" + socket3.getPort()); // www.naver.com/223.130.192.248:80
        System.out.println(socket2.getLocalAddress() + ":" + socket3.getLocalPort()); // /192.168.0.23:9999

        socket1.close();
        socket2.close();
        socket3.close();
    }
}
