package ch05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava3 extends JFrame {
    public static void main(String[] args) {
        HelloJava3 demo = new HelloJava3();
        demo.setVisible(true);
    }

    public HelloJava3() {
        super("HelloJava3");
        add(new HelloComponent3("Hello, Inner Java!"));
        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
    }

    class HelloComponent3 extends JComponent {
        String theMessage;
        int messageX = 125, messageY = 95;

        //        Coordinates of the message
        public HelloComponent3(String message) {
            theMessage = message;
            addMouseMotionListener(new MouseMotionListener() {
                public void mouseDragged(MouseEvent e) {
                    messageX = e.getX();
                    messageY = e.getY();
                    repaint();
                }
                public void mouseMoved(MouseEvent e) {
                }
            });
        }

        public void paintComponent(Graphics g) {
            g.drawString(theMessage, messageX,
                    messageY);
        }
    }
}
