package ch20.sec01_05;

import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SimpleclientTest {
    public static void main(String[] args) {

        Socket socket = null;
        InputStream is = null;
        OutputStream os = null;
        BufferedReader br = null;

        BufferedWriter bw;
        PrintWriter writer = null;
        InetAddress clientIP = null;
        String message = null;

        try {            
            socket = new Socket("127.0.0.1", 8888); // 연결 요청

            // 통신에 사용할 스트림
            is = socket.getInputStream();
            os = socket.getOutputStream();
            
            br = new BufferedReader(new InputStreamReader(is));
            message = br.readLine();
            System.out.println(message);
            
            bw = new BufferedWriter(new OutputStreamWriter(os));
            writer = new PrintWriter(bw, true);
            writer.println("클라이언트 : 안녕하세요.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
