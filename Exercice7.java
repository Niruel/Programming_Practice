/**
 * Exercise7
 * Nicholas Ruppel 
 * 2019/10/29
 */
import java.awt.*;
import javax.swing.*;
 class Exercise7 extends JFrame {
    int[][] position = {
    {20, 50}, 
    {200, 80}, 
    {80, 150}, 
    {220, 170}};
	Color[] color = {Color.red, Color.green, Color.blue, Color.cyan};
     Exercise7() {
        setSize(400,300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
           
    }  
    public void paint(Graphics g){
        g.clearRect(0, 0, 400, 300);
        for(int i = 0; i<position.length; i++){
            System.out.println(position[i][0]+position[i][1]);
            g.setColor(color[i]);
            g.fillRect(position[i][0],position[i][1] , 60, 30);
            
        }

    }
    
public static void main(String[] args) {
    new Exercise7();
}
}