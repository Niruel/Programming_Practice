/* comment */

import java.awt.Graphics;
import javax.swing.JFrame;


public class Painter10 extends JFrame {
	
	public Painter10() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		Face pacman1 = new Face(200, 50, 200, 160);
		pacman1.make(g);
		Face pacman2 = new Face(200, 420, 150, 60);
		pacman2.make(g);
	}

	public static void main(String[] args) {
		new Painter10();
	}
}
