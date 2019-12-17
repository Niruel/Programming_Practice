
/**
 * Exercise25 
 * Nicholas Ruppel
 * 2019/12/17
 */
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import javax.swing.JFrame;

public class Exercise25 extends JFrame {
    BufferedImage bimage;
    String filename = "image1.jpg";
    double rate = 1.34;

    Exercise25() {
        setSize(660, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        takeImage();
    }

    public void paint(Graphics g) {
        if (bimage != null) {
            g.drawImage(bimage, 10, 60, (int) (bimage.getWidth() * rate - 3), (int) (bimage.getHeight() * rate - 2),
                    this);
            // g.drawImage(bimage, 10, 60,
            // (int)(bimage.getWidth()),(int)bimage.getHeight(),this);
            System.out.println("Width = " + (int) (bimage.getWidth() * rate - 3) + " Height = "
                    + (int) (bimage.getHeight() * rate - 2));

        }

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
        new Exercise25();
    }
}