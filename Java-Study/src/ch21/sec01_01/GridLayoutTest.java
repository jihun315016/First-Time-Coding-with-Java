package ch21.sec01_01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.GridLayout;

public class GridLayoutTest {
    public static void main(String[] args) {
        Frame frame;
        Button button1, button2, button3;
        TextField tfl1, tfl2, tfl3;

        frame = new Frame("GridLayout 예제");
        button1 = new Button("button1");
        button2 = new Button("button2");
        button3 = new Button("button3");

        tfl1 = new TextField("입력창1 입니다.");
        tfl2 = new TextField("입력창2 입니다.");
        tfl3 = new TextField("입력창3 입니다.");

        frame.setLayout(new GridLayout(2, 0));

        frame.add(button1);
        frame.add(tfl1);
        frame.add(button2);
        frame.add(tfl2);
        frame.add(button3);
        frame.add(tfl3);

        // 프레임의 가로와 세로를 컴포넌트들의 그기와 일치하도록 한다.
        frame.pack();
        frame.setVisible(true);
    }
}
