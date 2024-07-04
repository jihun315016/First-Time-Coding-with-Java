package ch20.sec01_03;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class ServerSocketTest {
    public static void main(String[] args) throws IOException {
        // 클라이언트의 연결 요청을 처리한느 서버 역할을 하는 ServerSocket 클래스
        ServerSocket serverSocket1 = new ServerSocket();
        serverSocket1.bind(new InetSocketAddress("127.0.0.1", 8888));
        System.out.println(serverSocket1.isBound()); // true, 소켓의 바인딩 상태
        System.out.println(serverSocket1); // ServerSocket[addr=/127.0.0.1,localport=8888]

        ServerSocket serverSocket2 = new ServerSocket(9999);
        System.out.println(serverSocket2.isBound()); // true
        System.out.println(serverSocket2); // ServerSocket[addr=0.0.0.0/0.0.0.0,localport=9999]
    }
}
