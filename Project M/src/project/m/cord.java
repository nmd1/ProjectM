
package project.m;


public class cord {
    double time;
    int x;
    int y;
    public cord(long t, int x1, int y1) {
        time = t;
        x = x1;
        y = y1;
    }
    
    public void setTime(long t){
        time = t;
    }
    
    public void setX(int x1) {
        x = x1;
    }
    
    public void setY(int y1) {
        y = y1;
    }
    
    public double getTime () {
        return time;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
}

