import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        drawSquareGrid(graphics, 3, 0, 0, 300);
    }
    public static void drawSquareGrid (Graphics graphics, int lvl, int x, int y, int size){
        int side = WIDTH/3;

        if (lvl == 0) {
            return;
        }
        graphics.drawRect(size + (x/2), size + (y/2), size, size);
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                drawSquareGrid(graphics, lvl-1, x + (row * size), y + (col * size), side);
            }
            
        }
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
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