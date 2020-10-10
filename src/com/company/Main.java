package com.company;

public class Main {

    public static void main(String[] args) {
        MovablePoint pointOne = new MovablePoint(0, 0, 1, 1);
        MovablePoint pointTwo = new MovablePoint(1, 1, 1, 1);
	Movable one = new MovableRectangle(pointOne, pointTwo, 10, 20, "red", true);
	System.out.println(one.toString());
    }
}
