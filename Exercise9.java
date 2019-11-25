import java.awt.*;
import javax.swing.*;


/**
 * Exercise 9
 * Nicholas Ruppel 
 * 2019/10/29
 */

@SuppressWarnings("serial")
public class Exercise9  extends JFrame{

    Exercise9(){
        setSize(400,300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
    }
    public void paint(Graphics g){
        for(int i =0; i<50;i++){
            g.setColor(new Color(55+i*4,255,255));
            g.fillOval(100 + 2 *i, 190 -3*i, 200-i*4, 100-2*i);

        }
    }

    public static void main(String[] args) {
        new Exercise9();
    }
    
}