package ch20.extra;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.InetSocketAddress;

import java.net.InetSocketAddress;

public class MyServerSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket;
        String host = "127.0.0.1";
        int port = 28151;
        InetSocketAddress inetSocketAddress = new InetSocketAddress(host, port);

        serverSocket = new ServerSocket();
        serverSocket.bind(inetSocketAddress);

        // 소켓의 바인딩 상태 => true
        System.out.println(serverSocket.isBound());
        
        // 포트만 지정 가능
        // ServerSocket[addr=0.0.0.0/0.0.0.0,localport=9999]
        serverSocket = new ServerSocket(9999);
        System.out.println(serverSocket);
    }
}
