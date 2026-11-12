
import javax.swing.*;
import java.awt.*;

public class BurgerEating extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        // Background
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 600, 500);

        // Body
        g.setColor(Color.BLUE);
        g.fillRoundRect(180, 280, 180, 180, 50, 50);

        // Neck
        g.setColor(new Color(255, 204, 153));
        g.fillRect(245, 240, 50, 50);

        // Face
        g.setColor(new Color(255, 204, 153));
        g.fillOval(190, 70, 160, 180);

        // Hair
        g.setColor(Color.BLACK);
        g.fillArc(190, 65, 160, 100, 0, 180);

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(230, 140, 12, 15);
        g.fillOval(300, 140, 12, 15);

        // Mouth
        g.setColor(Color.RED);
        g.fillOval(260, 190, 25, 12);

        // Left arm
        g.setColor(new Color(255, 204, 153));
        g.fillRoundRect(330, 290, 100, 25, 20, 20);

        // Hand
        g.fillOval(410, 270, 35, 35);

        // Burger top bun
        g.setColor(new Color(218, 145, 55));
        g.fillArc(390, 190, 100, 65, 0, 180);

        // Cheese
        g.setColor(Color.YELLOW);
        g.fillRect(395, 230, 90, 12);

        // Patty
        g.setColor(new Color(100, 45, 20));
        g.fillRect(395, 242, 90, 15);

        // Bottom bun
        g.setColor(new Color(218, 145, 55));
        g.fillArc(395, 245, 90, 35, 180, 180);

        // Burger sesame seeds
        g.setColor(Color.WHITE);
        g.fillOval(420, 210, 5, 3);
        g.fillOval(445, 220, 5, 3);
        g.fillOval(465, 210, 5, 3);

        // Title
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 22));
        g.drawString("Person Eating a Burger!", 150, 40);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Burger Eating Animation");
        BurgerEating panel = new BurgerEating();

        frame.add(panel);
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
