
/**
 * Exercise 19 
 * Nicholas Ruppel
 * 2019/12/03
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Exercise19 extends JFrame implements MouseListener {
    int xCenter;
    int yCenter;
    int size = 100;
    boolean flag = false;
    boolean flag1 = false;
    Color color;

    Exercise19() {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseListener(this);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.clearRect(0, 0, 500, 500);
        if (flag) {
            Font font = new Font("Dialoge", Font.PLAIN, 20);
            g.setFont(font);
            g.setColor(Color.red);
            g.drawString("Enter", 440, 50);

        }
        if (flag1) {
            g.setColor(color);
            g.fillOval(xCenter - size / 2, yCenter - size / 2, size, size);

        }
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
        flag = true;
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        flag = false;
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        flag1 = true;
        xCenter = e.getX();
        yCenter = e.getY();
        color = Color.red;
        repaint();
    }

    public void mouseReleased(MouseEvent e) {

    }

    public static void main(String[] args) {
        new Exercise19();
    }
}