package ch20.extra;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleServer {
    public static void main(String[] args) {
        ServerSocket serverSocket;
        Socket socket;

        InputStream inputStream;
        OutputStream outputStream;

        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;

        PrintWriter printWriter;
        Scanner sc;

        try {
            sc = new Scanner(System.in);
            serverSocket = new ServerSocket(8888);
            System.out.println("서버 시작");

            while (true) {
                socket = serverSocket.accept();
                System.out.print("[서버] 접속 : " + socket.getInetAddress() + " >> 메시지 입력 : ");
                
                outputStream = socket.getOutputStream();
                // bufferedWriter에서 OutputStreamWriter객체를 통해 문자 데이터를 바이트로 변환한 후, 
                // outputStream 객체에 넘겨 전송
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
                printWriter = new PrintWriter(bufferedWriter, true); // 버퍼에 쓰기
                printWriter.println(sc.nextLine());

                inputStream = socket.getInputStream();
                // new InputStreamReader(inputStream) 바이트 데이터를 문자 스트림으로 변환 후,
                // BufferedReader로 읽어오기
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                System.out.println(bufferedReader.readLine());

                printWriter.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }    
}