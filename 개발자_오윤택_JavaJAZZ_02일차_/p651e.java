
import java.awt.*;
import javax.swing.*;

public class p651e extends JFrame {
    p651e() {
        setTitle("애완 동물");

        setLayout(new BorderLayout(10, 10));
        showCenter();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setVisible(true);
    }

    void showCenter() {

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JCheckBox back = new JCheckBox("배경색");
        JCheckBox fr = new JCheckBox("전경색");

        panel.add(back);
        panel.add(fr);

        add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new p651e();
    }
}