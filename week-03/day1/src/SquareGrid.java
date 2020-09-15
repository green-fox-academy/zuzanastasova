import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SquareGrid {
    public static void mainDraw (Graphics graphics) {
        graphics.setColor(Color.BLACK);
    }
    public static void drawSquareGrid (Graphics graphics){
        int side = (WIDTH/6)*4;
        int newWidth = WIDTH/6;
        int newHeight = HEIGHT/6;
        graphics.drawRect(newWidth, newHeight, side, side);
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        SierpinskyCarpet.ImagePanel panel = new SierpinskyCarpet.ImagePanel();
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