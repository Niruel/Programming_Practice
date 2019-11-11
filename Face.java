/*
 * Face which is an upper class of three types of PacMan
 * by H.Ogawa on 29 Oct 2019
 * Edited By Nicholas Ruppel
 * filled in Set functions
 */

import java.awt.Color;
import java.awt.Graphics;


public class Face {
	private int size;
	private int xCenter;
	private int yCenter;
	private int angle;
	
	public Face() {
	}
	
	public Face(int size_, int x_, int y_, int angle_) {
		setSize(size_);
		setXCenter(x_);
		setYCenter(y_);
		setAngle(angle_);
	}
	
	public int getSize() {
		return(size);
	}
	
	public void setSize(int num) {
		/* Correct this method */
		if (xCenter != 0) {
			setXCenter(xCenter);
		}
		if (yCenter != 0) {
			setYCenter(xCenter);
		}
		else{
		size = num;
		}
	}
	
	public int getXCenter() {
		return(xCenter);
	}
	
	public void setXCenter(int num) {
		/* Correct this method */
		if (num<size/2) {
			xCenter = num;
		}
		if ((num+size/2)>400) {
			xCenter = num;
		}
		
	}
	
	public int getYCenter() {
		return(yCenter);
	}
	
	public void setYCenter(int num) {
		/* Correct this method */
		if (num-size/2<25) {
			yCenter = num;
		}
		if (num+size/2>300) {
			yCenter=num;
		}
		
	}
	
	public int getAngle() {
		return(angle);
	}
	
	public void setAngle(int num) {
		/* Correct this method */
		if (num<90) {
			angle=90;
		}
		else{
			angle = num;
		}
		
	}
	
	public void make(Graphics g) {
		g.setColor(Color.yellow);
		g.fillArc(xCenter - size / 2, yCenter - size / 2, 
									size, size, angle / 2, 360 - angle); 
	}


}
