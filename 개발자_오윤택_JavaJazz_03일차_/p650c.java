
import java.awt.*;
import javax.swing.*;

public class p650c extends JFrame {
    p650c() {
        setTitle("색상을 선택해요");

        setLayout(new BorderLayout(10, 10));
        showNorth();
        showCenter();
        showWest();
        showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setVisible(true);
    }

    void showNorth() {

        String[] color = { "레드", "그린", "핑크" };
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 1, 1));

        JComboBox<String> cb = new JComboBox<>(color);

        panel.add(cb);

        add(panel, BorderLayout.NORTH);

    }

    void showCenter() {

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JCheckBox back = new JCheckBox("배경색");
        JCheckBox fr = new JCheckBox("전경색");

        panel.add(back);
        panel.add(fr);

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
        JButton yes = new JButton("예~");
        JButton no = new JButton("아뇨~");

        panel.add(yes);
        panel.add(no);

        add(panel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new p650c();
    }
}