import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * MouseDragTest02
 * 
 * Code by OhYunTaek... 2022.09.07.
 */

public class MouseDragTest02 extends JFrame {
    JLabel status;

    public MouseDragTest02() {

        setTitle("드래그에 의한 사각형");

        JPanel p1 = new JPanel();
        p1.setBackground(Color.PINK);

        MyMouseListener listener = new MyMouseListener();
        p1.addMouseListener(listener);
        p1.addMouseMotionListener(listener);

        JPanel p2 = new JPanel();
        status = new JLabel("마우스 위치 정보");
        p2.add(status);

        add("Center", p1);
        add("South", p2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 250);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener {
        int x1, y1, x2, y2;

        @Override
        public void mousePressed(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
            status.setText("(" + x1 + "," + y1 + ")");
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            x2 = e.getX();
            y2 = e.getY();
            status.setText("(" + x1 + "," + y1 + ") , (" + x2 + "," + y2 + ")");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            x2 = e.getX();
            y2 = e.getY();
            status.setText("(" + x1 + "," + y1 + ") , (" + x2 + "," + y2 + ")");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    public static void main(String[] args) {
        new MouseDragTest02();
    }
}