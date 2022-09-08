import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

// Code By Oh Yun Taek
// 레인보우 동그라미를 만들어보자
// 2022.09.07 (수)

public class ConcentricCirclesTest extends JFrame {
    ConcentricCirclesTest() {
        setTitle("레인보우 동그라미");

        class MyPanel extends JPanel {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                Color[] c = { Color.RED, Color.PINK, Color.ORANGE, Color.YELLOW,
                        Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
                        Color.PINK, new Color(0x000080), new Color(0x800080) };

                for (int i = 0; i < 11; i++) {
                    int d = delta(i);
                    g.setColor(c[i]);
                    g.drawOval(40 + d, 40 + d, 900 - d * 2, 900 - d * 2);
                }
            }
        }

        add(new MyPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setVisible(true);
    }

    int delta(int x) {
        double diagonal = Math.sqrt(900 * 900);
        return (int) (diagonal * 40 * x / 900);
    }

    public static void main(String[] args) {
        new ConcentricCirclesTest();
    }
}