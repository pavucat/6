package com.company;
public class Shape{
    String color;
    boolean filled;
    Shape() {};
    Shape(String color, boolean filled)
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
    public double getArea(){ return 0;};
    public double getPerimeter(){return 0;};
    @Override
    public String toString(){return "";};
}