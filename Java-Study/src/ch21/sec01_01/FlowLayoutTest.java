package ch21.sec01_01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.FlowLayout;

public class FlowLayoutTest {
    public static void main(String[] args) {
        Frame frame;
        Button button1, button2, button3;

        // 컴포넌트를 수평으로 나열하여 표시
        frame = new Frame("FlowLayout 예제");
        button1 = new Button("OK");
        button2 = new Button("Open");
        button3 = new Button("Close");

        frame.setLayout(new FlowLayout());
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
