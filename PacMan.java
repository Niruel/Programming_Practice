import java.awt.*;

public class PacMan {

    int size;
    int xCenter;
    int yCenter;
    int angle;
    public PacMan(){

    }
    public PacMan(int size_, int x_, int y_, int angle_){
        setSize(size_);
        setXCenter(x_);
        SetYCenter(y_);
        setAngle(angle_);
    }
   
    int getSize(){
        return(size);
    }
    void setSize(int num){

    }
    int getXCenter(){
        return(xCenter);
    }
    void setXCenter(int num){

    }
    int getYCenter(){
        return(yCenter);
    }
    void SetYCenter(int num){

    }
    int getAngle(){
        return(angle);
    }
    void setAngle(int num){

    }
    public void make(Graphics g){
        g.setColor(Color.yellow);
        g.fillArc(xCenter-size / 2, yCenter-size/2, size, size, angle/2, 360-size);
}
}