
import java.awt.*;
import javax.swing.*;

public class p643 extends JFrame {
    p643() {
        setTitle("원 넓이 구하기");

        setLayout(new BorderLayout(10, 10));
        showNorth();
        showCenter();
        showSouth();

        // ImageIcon icon = new ImageIcon(
        // this.getClass().getResource("dojang.png"));
        // JLabel label = new JLabel(icon, JLabel.CENTER);
        // add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 220);
        setVisible(true);
    }

    void showNorth() {

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(2, 0));

        JLabel l1 = new JLabel("레디우스");
        JLabel l2 = new JLabel("써클넓이");

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        t2.setEnabled(false);

        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        panel.add(p1);
        panel.add(p2);

        add(panel, BorderLayout.NORTH);
    }

    void showCenter() {

        ImageIcon icon = new ImageIcon(
                this.getClass().getResource("dojang.png"));
        JLabel label = new JLabel(icon, JLabel.CENTER);
        add(label);

        JPanel panel = new JPanel();

        JTextArea area = new JTextArea(30, 20);
        area.setText("이 영역에 원의 넓이를 /n계산하는 과정이 나타난다구");
        area.setEditable(false);
        area.setForeground(Color.ORANGE);

        panel.add(area);

        add(panel, BorderLayout.CENTER);
    }

    void showSouth() {
        String[] color = { "orange", "green" };

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton cal = new JButton("결과");
        JComboBox<String> cb = new JComboBox<>(color);
        JButton reset = new JButton("RESET");

        panel.add(cal);
        panel.add(cb);
        panel.add(reset);

        add(panel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new p643();
    }
}