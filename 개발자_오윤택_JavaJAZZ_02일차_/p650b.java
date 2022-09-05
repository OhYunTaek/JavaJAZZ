
import java.awt.*;
import javax.swing.*;

public class p650b extends JFrame {
    p650b() {
        setTitle("섭씨->화씨 변환해요");

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
        JPanel p2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(2, 0));

        JLabel l1 = new JLabel("섭씨");
        JLabel l2 = new JLabel("화씨");

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        t2.setEnabled(false);

        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        panel.add(p1);
        panel.add(p2);

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
        JButton cal = new JButton("변환하기");

        panel.add(cal);

        add(panel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new p650b();
    }
}