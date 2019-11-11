import java.awt.*;
import javax.swing.*;


/**
 * Exercise8
 * Nicholas Ruppel 
 * 2019/10/29
 */
public class Exercise8 extends JFrame {
    int[] size = {60, 40, 90, 120};
    int[][] position = {
        {20, 50}, 
        {200, 80}, 
        {80, 150}, 
        {220, 170}};
        Color[] color = {Color.red, Color.green, Color.blue, Color.cyan};
    Exercise8(){
        setSize(400,300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);

    }
    public void paint(Graphics g){
        g.clearRect(0, 0, 400, 300);

        for(int i =0; i<position.length;i++){
            g.setColor(color[i]);
            g.fillArc(position[i][0],position[i][1], size[i], size[i], 30, 300);
        }

    }
    public static void main(String[] args) {
        new Exercise8();
    }
}