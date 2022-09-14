import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

// Code By Oh Yun Taek
// 선풍기 팬을 만들어보자
// 2022.09.07 (수)

public class ThreeFansTest extends JFrame {
    ThreeFansTest() {
        setTitle("선풍기 날개");
        add(new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int cx = getWidth() / 2;
                int cy = getHeight() / 2;
                int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);
                int x = cx - radius;
                int y = cy - radius;

                g.setColor(Color.PINK);
                g.fillArc(x, y, radius * 2, radius * 2, 0, 30);
                g.fillArc(x, y, radius * 2, radius * 2, 120, 30);
                g.fillArc(x, y, radius * 2, radius * 2, 240, 30);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ThreeFansTest();
    }

}