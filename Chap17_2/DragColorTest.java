import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// Code By Oh Yun Taek
// 드래그로 네모 그리는데 색깔선택이 가능하다
// 2022.09.07 (수)

public class DragColorTest extends JFrame {
    private int x1, y1, x2, y2;
    private JLabel statusBar;
    Color color = Color.BLACK;

    DragColorTest() {
        setTitle("색상별 네모");

        DrawingArea drawingArea = new DrawingArea();

        MyMouseListener listener = new MyMouseListener();
        drawingArea.addMouseListener(listener);
        drawingArea.addMouseMotionListener(listener);

        add("South", new ButtonPanel(drawingArea));
        add("Center", drawingArea);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setVisible(true);
    }

    private class MyMouseListener implements MouseListener, MouseMotionListener {

        @Override
        public void mousePressed(MouseEvent evt) {
            x1 = evt.getX();
            y1 = evt.getY();
        }

        @Override
        public void mouseDragged(MouseEvent evt) {
            x2 = evt.getX();
            y2 = evt.getY();
        }

        @Override
        public void mouseReleased(MouseEvent evt) {
            x2 = evt.getX();
            y2 = evt.getY();
        }

        @Override
        public void mouseMoved(MouseEvent evt) {
        }

        @Override
        public void mouseClicked(MouseEvent evt) {
        }

        @Override
        public void mouseEntered(MouseEvent evt) {
        }

        @Override
        public void mouseExited(MouseEvent evt) {
        }

    }

    class DrawingArea extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(color);
            int x = (x1 < x2) ? x1 : x2;
            int y = (y1 < y2) ? y1 : y2;
            int width = Math.abs(x1 - x2);
            int height = Math.abs(y1 - y2);
            g.drawRect(x, y, width, height);
        }
    }

    class ButtonPanel extends JPanel implements ActionListener {
        private DrawingArea drawingArea;

        public ButtonPanel(DrawingArea drawingArea) {

            add(createButton("  ", Color.BLACK));
            add(createButton("  ", Color.PINK));
            add(createButton("  ", Color.BLUE));
            add(createButton("  ", Color.CYAN));
            add(createButton("  ", Color.MAGENTA));
        }

        private JButton createButton(String text, Color background) {
            JButton nutton = new JButton(text);
            button.setBackground(background);
            button.addActionListener(this);

            return button;
        }

        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            color = button.getBackground();
        }
    }

    public static void main(String[] args) {
        new DragColorTest();
    }

}