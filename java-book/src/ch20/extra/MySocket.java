package ch20.extra;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.InetAddress;

public class MySocket {
    public static void main(String[] args) throws IOException {
        Socket socket;
        String host = "www.naver.com";
        int port = 80;
        InetSocketAddress inetSocketAddress = new InetSocketAddress(host, port);

        socket = new Socket();
        socket.connect(inetSocketAddress);
        
        // www.naver.com/223.130.200.219:80
        System.out.println(socket.getInetAddress() + ":" + socket.getPort());
        
        // /192.168.0.23:29671
        System.out.println(socket.getLocalAddress() + ":" + socket.getLocalPort());
        
        
        // host, port 한 줄에 연결
        socket = new Socket(host, port); 
        
        // 로컬 IP 주소와 포트 번호를 원격지(host, port)에 연결
        socket = new Socket(host, port, InetAddress.getLocalHost(), 9999);
    }
}
