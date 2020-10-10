package com.company;

public class Rectangle extends Shape
{
    double width;
    double length;
    Rectangle(){};
    Rectangle(double width, double length)
    {
        this.length=length;
        this.width=width;
    }
    Rectangle (double width, double length, String color, boolean filled)
    {
        this.length=length;
        this.width=width;
        this.color=color;
        this.filled=filled;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double lenght) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*length+2*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                "lenght="+ length+"area="+getArea()+"perimeter="+getPerimeter()+"}";
    }
}
