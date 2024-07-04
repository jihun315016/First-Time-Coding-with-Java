package ch09.sec03_03;

public class ShapeTest {
    public static void main(String[] args) {
        int width = 10;
        int height = 20;
        
        Rect rec = new Rect();
        float area = rec.calcArea(width, height);
        rec.printArea(area);

        Tri tri = new Tri();
        area = tri.calcArea(width, height);
        tri.printArea(area);
    }
}
