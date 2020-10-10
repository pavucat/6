package com.company;

public class MovableRectangle extends Rectangle implements Movable
{
    MovablePoint one = new MovablePoint(0, 0, 0, 0);
    MovablePoint two = new MovablePoint(0, 0, 0, 0);
    MovableRectangle(MovablePoint point1, MovablePoint point2, int width, int length, String color, boolean filled)
    {
        one.x=point1.x;
        one.xSpeed=point1.xSpeed;
        one.y=point1.y;
        one.ySpeed=point1.ySpeed;
        two.x=point2.x;
        two.xSpeed=point2.xSpeed;
        two.y=point2.y;
        two.ySpeed=point2.ySpeed;
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
    public void moveUp()
    {
        one.moveUp();
        two.moveUp();
    };
    public void moveDown()
    {
        one.moveDown();
        two.moveDown();
    }
    public void moveLeft()
    {
        one.moveLeft();
        two.moveLeft();
    }
    public void moveRight()
    {
        one.moveRight();
        two.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "one=" + one +
                ", two=" + two +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
