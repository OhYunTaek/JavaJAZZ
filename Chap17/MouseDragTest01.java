import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * MouseDragTest01
 * 
 * Code by OhYunTaek... 2022.09.07.
 */

public class MouseDragTest01 extends JFrame {
    public MouseDragTest01() {

        setTitle("Drag to Rectangle...!");

        JPanel p1 = new JPanel();
        p1.setBackground(Color.YELLOW);

        JPanel p2 = new JPanel();
        JLabel status = new JLabel("Mouse Location");
        p2.add(status);

        add("Center", p1);
        add("South", p2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseDragTest01();
    }
}