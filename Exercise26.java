
/**
 * Exercise21 
 * Nicholas Ruppel
 * 2019/12/17
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import javax.swing.JFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class Exercise26 extends JFrame {
    BufferedImage bimage;
    BufferedImage getImage;
    int rect[][] = { { 0, 0 }, { 0, 0 } };
    String filename = "image2.jpg";

    Exercise26() {
        setSize(660, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        MyListenter myListenter = new MyListenter();
        addMouseListener(myListenter);
        addMouseMotionListener(myListenter);
        takeImage();
    }

    public void paint(Graphics g) {
        int hpostion = 550;
        g.clearRect(0, 0, 700, 800);
        if (bimage != null) {
            g.drawImage(bimage, 10, 60, this);
        }
        if (getImage != null) {
            g.drawImage(getImage, 10, hpostion, this);
        }
        g.setColor(Color.red);
        g.drawRect(rect[0][0], rect[0][1], rect[1][0] - rect[0][0], rect[1][1] - rect[0][1]);
    }

    public void takeImage() {
        try {
            File file = new File(filename);
            bimage = ImageIO.read(file);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error " + e);
        }
        repaint();
    }

    public static void main(String[] args) {
        new Exercise26();
    }

    class MyListenter extends MouseAdapter {
        int cx;
        int cy;
        String str;

        public void mousePressed(MouseEvent e) {
            rect[0][0] = e.getX();
            rect[0][1] = e.getY();

        }

        public void mouseReleased(MouseEvent e) {
            getImage = bimage.getSubimage(rect[0][0] - 10, rect[0][1] - 60, rect[1][0] - rect[0][0],
                    rect[1][1] - rect[0][1]);
            repaint();
        }

        public void mouseDragged(MouseEvent e) {
            rect[1][0] = e.getX();
            rect[1][1] = e.getY();
            repaint();
        }
    }
}