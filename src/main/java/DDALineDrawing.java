
import javax.swing.*;
import java.awt.*;

public class DDALineDrawing extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x1 = 80, y1 = 100;
        int x2 = 450, y2 = 300;

        int dx = x2 - x1;
        int dy = y2 - y1;

        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        float xIncrement = (float) dx / steps;
        float yIncrement = (float) dy / steps;

        float x = x1;
        float y = y1;

        g.setColor(Color.BLUE);

        for (int i = 0; i <= steps; i++) {
            g.fillRect(Math.round(x), Math.round(y), 3, 3);

            x += xIncrement;
            y += yIncrement;
        }

        g.setColor(Color.BLACK);
        g.drawString("DDA Line Drawing Algorithm", 150, 40);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DDA Line Drawing");
        frame.add(new DDALineDrawing());
        frame.setSize(600, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
