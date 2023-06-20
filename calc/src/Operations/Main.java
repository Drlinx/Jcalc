package Operations;

//package com.graphics.swing;
//importing required packages for graphics
import java.awt.*;
import javax.swing.JFrame;

//extending Canvas class into our own class
public class Main extends Canvas {
    private static final long serialVersionUID = 1L;

    public void paint(Graphics graphics) {
        graphics.drawString("Test", 50, 50);
        setBackground(Color.PINK);
        graphics.fillRect(150, 140, 100, 81);
        graphics.drawOval(30, 131, 100, 61);
        setForeground(Color.blue);
    }

    public static void main(String[] args) {
        Main graphicsDemo = new Main();
        JFrame jFrame = new JFrame();
        jFrame.add(graphicsDemo);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }
}