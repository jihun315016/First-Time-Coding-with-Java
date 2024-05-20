package ch21.sec01_01;

import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.BorderLayout;

class BorderLayoutTest {
    public static void main(String[] args) {
        Frame frame;
        Button center, west, east, north, south;
        TextField tfl;

        // 화면을 5개 영역으로 구분하여 표시
        // Frame은 기본적으로 안 보이도록 설정되어 있어 Visible true 설정 필요
        frame = new Frame("BorderLayout 예제");
        south = new Button("button1");
        west = new Button("button2");
        east = new Button("button3");
        center = new Button("button4");
        tfl = new TextField("입력창입니다.");

        frame.add(tfl, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(west, BorderLayout.WEST);
        frame.add(east, BorderLayout.EAST);
        frame.add(center, BorderLayout.CENTER);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}