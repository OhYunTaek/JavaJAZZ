import java.awt.*;
import javax.swing.*;

public class p651f extends JFrame {
    p651f() {
        setTitle("p651 6번문제");
        setLayout(new GridLayout(0, 5));

        add(new JButton("1호"));
        add(new JButton("2호"));
        add(new JButton("3호"));
        add(new JButton("4호"));
        add(new JButton("5호"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 80);
        setVisible(true);
    }

    public static void main(String[] args) {
        new p651f();
    }
}