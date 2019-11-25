/*
 * PacMan
 * by H.Ogawa on 30/10/2018
 * Edited By Nicholas Ruppel 2019/10/26
 */


import java.awt.Graphics;

public class PacMan extends Face{
	
	public PacMan(int size_, int x_, int y_, int angle_) {
		//super(size_, x_, y_, angle_);
		setSize(size_);
		setXCenter(x_);
		setYCenter(y_);
		setAngle(angle_);
	}
	
	public void make(Graphics g) {
		super.make(g);
	}
}