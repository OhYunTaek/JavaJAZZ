
import java.awt.*;
import javax.swing.*;

public class p642 extends JFrame {
    p642() {
        setTitle("원 넓이 구하기");

        setLayout(new BorderLayout(10, 10));
        showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 105);
        setVisible(true);
    }

    void showSouth() {

        String[] color = { "orange", "green" };

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton cal = new JButton("계산");
        JComboBox<String> cb = new JComboBox<>(color);
        JButton reset = new JButton("RESET");

        panel.add(cal);
        panel.add(cb);
        panel.add(reset);

        add(panel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new p642();
    }
}