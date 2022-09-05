
import java.awt.*;
import javax.swing.*;

public class p650a extends JFrame {
    p650a() {
        setTitle("입력해요");

        setLayout(new BorderLayout(10, 10));
        showCenter();
        showWest();
        showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 170);
        setVisible(true);
    }

    void showCenter() {

        JPanel p1 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(1, 1));

        JLabel l1 = new JLabel("첫 번째 넘버?");

        JTextField t1 = new JTextField(25);

        p1.add(l1);
        p1.add(t1);
        panel.add(p1);

        add(panel, BorderLayout.CENTER);

    }

    void showWest() {
        ImageIcon icon = new ImageIcon(
                this.getClass().getResource("dojang.png"));
        JLabel label = new JLabel(icon);
        add(label, BorderLayout.WEST);
    }

    void showSouth() {

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton cal = new JButton("확인해요");
        JButton reset = new JButton("취소해요");

        panel.add(cal);
        panel.add(reset);

        add(panel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new p650a();
    }
}