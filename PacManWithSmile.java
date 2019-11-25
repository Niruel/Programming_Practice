/*
 * PacManWithSmile that inherits PacMan
 * by H.Ogawa on 29 Oct 2019
 * Edited By Nicholas Ruppel 2019/10/29
 */

import java.awt.Color;
import java.awt.Graphics;

public class PacManWithSmile extends Face {
	
	public PacManWithSmile(int size_, int x_, int y_, int angle_) {
		super(size_, x_, y_, angle_);
	}
	
	public void make(Graphics g) {
		int xCenter = getXCenter();
		int yCenter = getYCenter();
		int size = getSize();
		super.make(g);
		g.setColor(Color.black);
		g.drawArc(xCenter - size / 12, yCenter - size / 3,  
									size / 6, size / 6, 0, 180);
	}
}
