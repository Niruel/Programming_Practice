
/**
 * Exercise29
 * Nicholas Ruppel
 * 2019/12/24
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.AffineTransformOp;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise29 extends JFrame implements ActionListener {
    BufferedImage bI1;
    BufferedImage bI2;
    String fileName = "imageA.jpg";
    int xCenter;
    int yCenter;
    JButton button;
    // double scale = 0.7;
    double rotate = Math.toRadians(1);

    Exercise29() {
        setSize(700, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initialazation();

        button = new JButton("Turn Right");
        button.addActionListener(this);
        button.setActionCommand("btn");

        JPanel panel = new JPanel();
        panel.add(button);

        getContentPane().add(panel, BorderLayout.NORTH);
        setVisible(true);
    }

    public void paint(Graphics g) {
        int hpostion = 550;
        int size = 5;
        // g.clearRect(0, 60, 700, 720);
        if (bI1 != null) {
            g.drawImage(bI1, 30, 60, this);

        }
        if (bI2 != null) {
            g.drawImage(bI2, 30, 60, this);
        }
    }

    void Transform() {
        bI2 = new BufferedImage(bI1.getWidth(), bI1.getHeight(), bI1.getType());
        xCenter = bI2.getWidth() / 2;
        yCenter = bI2.getHeight() / 2;
        AffineTransform affine = new AffineTransform();
        affine.translate(xCenter, yCenter);
        System.out.println(xCenter + "," + yCenter);
        // affine.scale(scale, scale);
        System.out.println(rotate);
        affine.rotate(rotate);
        affine.translate(-xCenter, -yCenter);
        AffineTransformOp op = new AffineTransformOp(affine, AffineTransformOp.TYPE_BICUBIC);
        op.filter(bI1, bI2);
    }

    void initialazation() {
        try {
            bI1 = ImageIO.read(new File(fileName));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("btn")) {
            rotate += Math.toRadians(1);

            Transform();
            repaint();

            System.out.println("Rotate");
        }
    }

    public static void main(String[] args) {
        new Exercise29();
    }
}