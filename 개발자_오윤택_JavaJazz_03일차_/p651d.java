import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class p651d extends JFrame {

    p651d() {

        String[] alpha = { "＃", "＆", "☆", "♩", "■", "♠", "◈", "☎", "♀", "♂" };
        setTitle("알파벳 랜덤배치");
        setLayout(null);

        for (int i = 0; i < 10; i++) {
            JLabel label = new JLabel(alpha[i]);
            int x = 30 + (int) (Math.random() * 200);
            int y = 30 + (int) (Math.random() * 100);
            label.setLocation(x, y);
            label.setSize(20, 20);
            add(label);
        }

        ImageIcon icon = new ImageIcon(this.getClass().getResource("dojang.png"));
        JLabel label2 = new JLabel("도장", icon, JLabel.CENTER);
        add(label2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new p651d();
    }
}