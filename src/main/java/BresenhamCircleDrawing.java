
import javax.swing.*;
import java.awt.*;

public class BresenhamCircleDrawing extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int xc = 300;
        int yc = 250;
        int r = 120;

        int x = 0;
        int y = r;
        int d = 3 - 2 * r;

        g.setColor(Color.RED);

        while (x <= y) {

            plotPoints(g, xc, yc, x, y);

            if (d < 0) {
                d = d + 4 * x + 6;
            } else {
                d = d + 4 * (x - y) + 10;
                y--;
            }

            x++;
        }

        g.setColor(Color.BLACK);
        g.drawString("Bresenham's Circle Drawing Algorithm", 160, 40);
    }

    private void plotPoints(Graphics g, int xc, int yc, int x, int y) {

        g.fillRect(xc + x, yc + y, 3, 3);
        g.fillRect(xc - x, yc + y, 3, 3);
        g.fillRect(xc + x, yc - y, 3, 3);
        g.fillRect(xc - x, yc - y, 3, 3);

        g.fillRect(xc + y, yc + x, 3, 3);
        g.fillRect(xc - y, yc + x, 3, 3);
        g.fillRect(xc + y, yc - x, 3, 3);
        g.fillRect(xc - y, yc - x, 3, 3);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bresenham Circle");
        frame.add(new BresenhamCircleDrawing());
        frame.setSize(650, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
