
/**
 * Exercise21 
 * Nicholas Ruppel
 * 2019/12/03
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Exercise21 extends JFrame implements ActionListener, MouseListener {
    Color[] colorSet = { Color.red, Color.yellow, Color.green, Color.blue };
    String[] stringSet = { "red", "yellow", "green", "blue" };
    String[] shapeLabel = { "Circle", "Square" };
    JButton button;
    JButton button2;
    boolean flag = false;
    boolean flag1 = false;
    boolean flag3 = false;
    int looping = 0;
    int looping2 = 0;
    int xCenter;
    int yCenter;
    int size = 100;
    Color color;

    Exercise21() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);

        button = new JButton(stringSet[0]);
        button.addActionListener(this);
        button.setActionCommand("btn");

        button2 = new JButton(shapeLabel[0]);
        button2.addActionListener(this);
        button2.setActionCommand("btn1");

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(button2);

        getContentPane().add(panel, BorderLayout.NORTH);

        setVisible(true);

    }

    public void paint(Graphics g) {
        super.paint(g);
        g.clearRect(0, 70, 500, 450);
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
        if (flag3) {
            g.setColor(color);
            g.fillRect(xCenter - size / 2, yCenter - size / 2, size, size);

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
        if (looping2 == 0) {
            flag1 = true;
            xCenter = e.getX();
            yCenter = e.getY();
            color = colorSet[looping];
        }
        if (looping2 == 1) {
            flag3 = true;
            xCenter = e.getX();
            yCenter = e.getY();
            color = colorSet[looping];
        }

        System.out.println(shapeLabel[looping2] + " ," + color);

        repaint();

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        switch (cmd) {

        case "btn":

            looping++;
            if (looping > 3) {
                looping = 0;
            }
            button.setText(stringSet[looping]);
            color = colorSet[looping];
            repaint();
            break;
        case "btn1":
            looping2++;
            if (looping2 > 1) {
                looping2 = 0;
            }
            if (looping2 == 0) {
                flag1 = true;
                flag3 = false;
                button2.setText(shapeLabel[looping2]);
                repaint();
            }
            if (looping2 == 1) {
                flag3 = true;
                flag1 = false;
                button2.setText(shapeLabel[looping2]);
                repaint();
            }

            // System.out.println(looping2);
            break;
        default:
            break;
        }

    }

    public static void main(String[] args) {
        new Exercise21();
    }
}