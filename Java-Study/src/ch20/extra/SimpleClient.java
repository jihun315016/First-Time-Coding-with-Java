package ch20.extra;

import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class SimpleClient {
    public static void main(String[] args) {
        Socket socket;

        InputStream inputStream;
        OutputStream outputStream;

        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;

        PrintWriter printWriter;
        Scanner sc;

        try {
            sc = new Scanner(System.in);

            // 연결 요청
            socket = new Socket("127.0.0.1", 8888);

            inputStream = socket.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println(bufferedReader.readLine());

            outputStream = socket.getOutputStream();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            printWriter = new PrintWriter(bufferedWriter, true);
            System.out.print("[클라이언트] 메시지 입력 : ");
            printWriter.println(sc.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
