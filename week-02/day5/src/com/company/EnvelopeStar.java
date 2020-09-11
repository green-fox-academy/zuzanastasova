package com.company;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        for (int numberOfLines = 0; numberOfLines < WIDTH; numberOfLines += 20) {
            graphics.setColor(Color.magenta);
            graphics.drawLine(0 + numberOfLines,0, WIDTH, 20 + numberOfLines);
            graphics.drawLine(WIDTH, HEIGHT - numberOfLines, WIDTH - numberOfLines - 20,0);
        }
        for (int numberOfLines = 0; numberOfLines < WIDTH; numberOfLines += 20) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0 ,0 + numberOfLines, 20 + numberOfLines, HEIGHT);
            graphics.drawLine(WIDTH - numberOfLines, HEIGHT , 0,HEIGHT - numberOfLines - 20);

        }

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        LinePlay.ImagePanel panel = new LinePlay.ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }

}
