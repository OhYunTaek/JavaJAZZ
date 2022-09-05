import java.awt.*;
import javax.swing.*;

public class p651g extends JFrame {

    public p651g() {
        setTitle("문제7번");

        ImageIcon icon = new ImageIcon(this.getClass().getResource("dojang.png"));
        JLabel label = new JLabel(icon, JLabel.CENTER);
        add(label);

        JPanel p = new JPanel(new FlowLayout());
        p.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        JButton a1 = new JButton("<<");
        JButton a2 = new JButton("<");
        JButton a3 = new JButton(">");
        JButton a4 = new JButton(">>");
        add("North", p);
        p.add(a1);
        p.add(a2);
        p.add(a3);
        p.add(a4);

        JPanel o = new JPanel(new CardLayout());
        for (int c = 1; c <= 5; c++) {
            o.add(new JButton("카드 남바" + c + "!"));
        }
        add("Center", o);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);

    }

    public static void main(String[] args) {
        new p651g();
    }
}