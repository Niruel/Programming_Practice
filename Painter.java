import java.awt.*;

import javax.swing.JFrame;

/**
 * Painter
 */
public class Painter extends JFrame {

    public Painter(){
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Paint(Graphics g){
        PacMan pacman1 = new PacMan(100, 80,150,60);
        pacman1.make(g)
        ;

    }
}