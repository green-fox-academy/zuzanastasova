import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        drawSierpinsky(graphics,7,600 , 0, 0);
    }
    public static void drawSierpinsky (Graphics graphics, int lvl, int size, int x, int y) {
        int side = size/3;
        if (lvl == 0)
            return;
        graphics.fillRect(x + side, y + side,side,side);
        for (int row = 0; row < 3; row ++) {
            for (int col = 0; col < 3; col++) {
                drawSierpinsky(graphics, lvl-1, side, (side * row) + x, (side * col) + y);
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
