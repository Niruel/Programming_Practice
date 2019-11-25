/* Created by: Nicholas Ruppel
*  Exercise 10(File name is painter10)
*  Handing in for Review day
*  2019/11/26
*/

import java.awt.Graphics;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Painter10 extends JFrame {
	
	public Painter10() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		PacMan pacman1 = new PacMan(200, 300, 50, 160);
		pacman1.make(g);
		PacMan pacman2 = new PacMan(200, 300, 350, 160);
		pacman2.make(g);
	}

	public static void main(String[] args) {
		new Painter10();
	}
}
