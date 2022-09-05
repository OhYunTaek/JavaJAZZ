
import java.awt.*;
import javax.swing.*;

public class p641 extends JFrame {
    p641() {
        setTitle("원 넓이 구하기");

        setLayout(new BorderLayout(10, 10));
        showNorth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 105);
        setVisible(true);
    }

    void showNorth() {
        JPanel panel = new JPanel();

        JTextArea area = new JTextArea(30, 20);
        area.setText("이 영역에 원의 넓이를 /n계산하는 과정이 나타난다");
        area.setEditable(false);
        area.setForeground(Color.PINK);
        panel.add(area);

        add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new p641();
    }
}