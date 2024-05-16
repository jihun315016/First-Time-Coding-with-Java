package ch19.sec01_01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteDataWriteTest {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\TEMP\\Java-First-Study\\Java-Study\\src\\ch19\\sec01_01");
            Scanner sc = new Scanner(System.in);
            System.out.print("문자열 입력 : ");
            String str = sc.nextLine();

            char ch;
            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                fos.write(ch);
            }

            System.out.println("파일에 출력했습니다.");
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
