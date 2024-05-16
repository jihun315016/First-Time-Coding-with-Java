package ch20.extra;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.InetSocketAddress;

public class MyServerSocket {
    public static void main(String[] args) throws IOException {
        String host = "www.naver.com";
        int port = 80;

        ServerSocket serverSocket = new ServerSocket();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(host, port);
        serverSocket.bind(host, port);
    }
}
