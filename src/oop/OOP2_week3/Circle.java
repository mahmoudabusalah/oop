package oop.OOP2_week3;

public class Circle {

    public double getRound(int radius) {
        return 2 * Math.PI * Math.pow(radius, 2);
    }

    public double getArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
