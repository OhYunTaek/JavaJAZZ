import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

// Code By Oh Yun Taek
// 웃는 얼굴을 만들어보자
// 2022.09.07 (수)

public class FaceTest extends JFrame {
    FaceTest() {
        setTitle("스마일");
        add(new CustomPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(260, 260);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FaceTest();
    }

    class CustomPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // 노란얼굴
            g.setColor(Color.YELLOW);
            g.fillOval(10, 10, 200, 200);
            // 얼굴외곽
            g.setColor(Color.BLACK);
            g.drawOval(10, 10, 200, 200);

            // 왼쪽 눈 바탕
            g.setColor(Color.WHITE);
            g.fillOval(35, 35, 30, 50);
            // 왼쪽 눈 외곽
            g.setColor(Color.BLACK);
            g.drawOval(35, 35, 30, 50);
            // 왼쪽 눈 알
            g.setColor(Color.BLACK);
            g.fillOval(40, 40, 15, 25);

            // 오른쪽 눈 바탕
            g.setColor(Color.WHITE);
            g.fillOval(110, 35, 30, 50);
            // 오른쪽 눈 외곽
            g.setColor(Color.BLACK);
            g.drawOval(110, 35, 30, 50);
            // 오른쪽 눈 알
            g.setColor(Color.BLACK);
            g.fillOval(115, 40, 15, 25);

            // 코 색깔
            g.setColor(Color.RED);
            g.fillOval(66, 76, 30, 25);
            // 코 외곽
            g.setColor(Color.BLACK);
            g.drawOval(66, 76, 30, 25);

            // 입
            g.setColor(Color.BLACK);
            g.fillArc(30, 110, 140, 70, 0, -180);
            g.setColor(Color.YELLOW);
            g.fillArc(30, 107, 140, 70, 0, -180);

        }
    }
}