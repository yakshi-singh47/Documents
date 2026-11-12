import javax.swing.*;
import java.awt.*;

public class SunriseAnimation extends JPanel implements Runnable {

    int sunY = 250;

    public SunriseAnimation() {
        setBackground(Color.BLACK);
        Thread t = new Thread(this);
        t.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the sun first
        g.setColor(Color.YELLOW);
        g.drawOval(350, sunY, 100, 100);

        // Draw the mountains in front of the sun
        g.setColor(Color.GREEN);

        g.drawLine(0, 300, 150, 150);
        g.drawLine(150, 150, 300, 300);

        g.drawLine(200, 300, 400, 100);
        g.drawLine(400, 100, 600, 300);

        g.drawLine(500, 300, 700, 170);
        g.drawLine(700, 170, 800, 300);
    }

    public void run() {
        while (sunY > 100) {
            sunY = sunY - 2;
            repaint();

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sunrise Animation");
        SunriseAnimation panel = new SunriseAnimation();

        frame.add(panel);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
