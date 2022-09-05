
import java.awt.*;
import javax.swing.*;

public class p651e extends JFrame {
    p651e() {
        setTitle("애완 동물");

        setLayout(new BorderLayout(10, 10));
        showCenter();
        // showWest();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setVisible(true);
    }

    void showCenter() {

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JRadioButton back = new JRadioButton("멍뭉이");
        JRadioButton ct = new JRadioButton("야옹이");
        JRadioButton fr = new JRadioButton("뻐끔이");

        // ImageIcon icon = new ImageIcon(this.getClass().getResource("dojang.png"));
        // JLabel label = new JLabel(icon, JLabel.CENTER);
        // label.add(label);

        panel.add(back);
        panel.add(ct);
        panel.add(fr);

        add(panel, BorderLayout.CENTER);

        // add(label, BorderLayout.WEST);
    }

    // void showWest() {
    // ImageIcon icon = new ImageIcon(this.getClass().getResource("dojang.png"));
    // JLabel label = new JLabel(icon, JLabel.CENTER);
    // add(label);

    // add(label, BorderLayout.WEST);
    // }

    public static void main(String[] args) {
        new p651e();
    }
}