
/**
 * Exercise28
 * Nicholas Ruppel
 * 2019/12/24
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.AffineTransformOp;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Exercise28 extends JFrame {
    BufferedImage bI1;
    BufferedImage bI2;
    String fileName = "imageA.jpg";
    int xCenter = 240;
    int yCenter = 320;
    double scale = 0.7;
    double rotate = Math.toRadians(6);

    Exercise28() {
        setSize(700, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initialazation();
        Transform();
        setVisible(true);
    }

    public void paint(Graphics g) {
        int hpostion = 550;
        int size = 5;
        if (bI1 != null) {
            g.drawImage(bI1, 30, 60, this);

        }
        if (bI2 != null) {
            g.drawImage(bI2, 30, hpostion, bI2.getWidth() / 2, bI2.getHeight() / 2, this);
        }
    }

    void initialazation() {
        try {
            bI1 = ImageIO.read(new File(fileName));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    void Transform() {
        bI2 = new BufferedImage(bI1.getWidth(), bI1.getHeight(), bI1.getType());

        AffineTransform affine = new AffineTransform();
        affine.translate(xCenter, yCenter);
        System.out.println(xCenter + "," + yCenter);
        affine.scale(scale, scale);
        affine.rotate(rotate);
        affine.translate(-xCenter, -yCenter);
        AffineTransformOp op = new AffineTransformOp(affine, AffineTransformOp.TYPE_BICUBIC);
        op.filter(bI1, bI2);
    }

    public static void main(String[] args) {
        new Exercise28();
    }
}