import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

// Code By Oh Yun Taek
// 버튼을 누르면 피자가 돌아간다
// 2022.09.07 (수)

public class PizzaTest extends JFrame {
    int i = 0;

    PizzaTest() {
        setTitle("피자 노놔먹기");

        JButton button = new JButton("한조각 더!!");
        JPanel panel = new JPanel();
        panel.add(button);
        button.addActionListener(e -> {
            i = ++i % 5;
            System.out.println(i);
            repaint();
        });

        class MyPanel extends JPanel {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                Color[] c = { Color.PINK, Color.CYAN, Color.MAGENTA, 
                    Color.ORANGE, Color.GRAY };
                
                g.setColor(c[i]);
                g.fillArc(40, 30, 150, 150, i * 72, 72);
            }
        }

        add(panel, BorderLayout.NORTH);
        add(new MyPanel(), BorderLayout.CENTER);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(280, 280);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PizzaTest();
    }

}