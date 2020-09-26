package com.company;
public class shape{
    String color;
    boolean filled;
    shape() {};
    shape(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getarea(){ return 0;};
    public double getperimeter(){return 0;};
    @Override
    public String toString(){return "";};
}
class Rectangle extends shape
{
    double width;
    double lenght;
    Rectangle(){};
    Rectangle(double width, double lenght)
    {
        this.lenght=lenght;
        this.width=width;
    }
    Rectangle (double width, double lenght, String color, boolean filled)
    {
        this.lenght=lenght;
        this.width=width;
        this.color=color;
        this.filled=filled;
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getarea() {
        return lenght*width;
    }

    @Override
    public double getperimeter() {
        return 2*lenght+2*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                "lenght="+ lenght+"area="+getarea()+"perimeter="+getperimeter()+"}";
    }
}
class Movablerectangle extends Rectangle implements Movable
{
    Movablepoints pointone = new Movablepoints(0, 0, 0, 0);
    Movablepoints pointtwo = new Movablepoints(1, 1, 0, 0);
    Movablerectangle(int x1, int x2, int y1, int y2, int xspeed, int yspeed, double width, double lenght, String color, boolean filled)
    {
        pointone.x1=x1;
        pointone.y1=y1;
        pointone.xspeed=xspeed;
        pointone.yspeed=yspeed;
        pointtwo.xspeed=xspeed;
        pointtwo.yspeed=yspeed;
        pointtwo.x1=x2;
        pointtwo.y1=y2;
        this.width=width;
        this.color=color;
        this.filled=filled;
        this.lenght=lenght;
    }
    public void moveup()
    {
        pointtwo.y1+=pointone.yspeed;
        pointone.y1+=pointone.yspeed;
    };
    public void movedown()
    {
        pointtwo.y1-=pointone.yspeed;
        pointone.y1-=pointone.yspeed;
    }
    public void left()
    {
        pointtwo.x1-=pointone.xspeed;
        pointone.x1-=pointone.xspeed;
    }
    public void right()
    {
        pointtwo.x1+=pointone.xspeed;
        pointone.x1+=pointone.xspeed;
    }

    @Override
    public String toString() {
        return "Movablerectangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", lenght=" + lenght +
                ", pointone=" + pointone +
                ", pointtwo=" + pointtwo +
                '}';
    }
}