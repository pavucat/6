package com.company;

public class Movablepoints implements Movable {
    int x1;
    int y1;
    int xspeed;
    int yspeed;
    Movablepoints(int x1, int y1, int xspeed, int yspeed)
    {
        this.x1=x1;
        this.y1=y1;
        this.xspeed=xspeed;
        this.yspeed=yspeed;
    }

    @Override
    public String toString() {
        return "Movablepoints{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", xspeed=" + xspeed +
                ", yspeed=" + yspeed +
                '}';
    }

    public void moveup()
    {
        y1+=yspeed;
    };
    public void movedown()
    {
    }
    public void left()
    {
        x1-=xspeed;
    }
    public void right()
    {
        x1+=xspeed;
    }
}
