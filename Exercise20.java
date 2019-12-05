
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
public class Exercise20 extends JFrame implements ActionListener, MouseListener {
    Color[] colorSet = { Color.red, Color.yellow, Color.green, Color.blue };
    String[] stringSet = { "red", "yellow", "green", "blue" };
    JButton button;
    boolean flag = false;
    boolean flag1 = false;
    int looping = 0;

    int xCenter;
    int yCenter;
    int size = 100;
    Color color;

    Exercise20() {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button = new JButton(stringSet[0]);
        button.addActionListener(this);
        button.setActionCommand("btn");
        addMouseListener(this);

        JPanel panel = new JPanel();
        panel.add(button);

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
        // System.out.println("x");
        flag1 = true;
        xCenter = e.getX();
        yCenter = e.getY();
        color = colorSet[looping];
        repaint();
    }

    public void mouseReleased(MouseEvent e) {

    }

    public void actionPerformed(ActionEvent e) {

        // flag = true;
        flag1 = true;
        String cmd = e.getActionCommand();

        if (cmd.equals("btn")) {
            looping++;

            System.out.println(looping);
            if (looping > 3) {
                looping = 0;
            }

            button.setText(stringSet[looping]);
            color = colorSet[looping];
            repaint();
        }
    }

    public static void main(String[] args) {
        new Exercise20();
    }
}