package oop.OOP2_week3;

import java.util.Scanner;

public class Circle2 {
    public static final double PI = 3.14159;
    private int radius;

    public Circle2(int radius) {
        setRadius(radius);
    }

    public Circle2() {
        this(0);
    }

    public void setRadius(int radius) {
        if (radius < 0) {
            Scanner var = new Scanner(System.in);
            while (radius < 0) {
                System.out.print("Radius cannot be negative, Please enter a non-negative radius: ");
                radius = var.nextInt();
            }
            var.close();
        }
        this.radius = radius;
    }

    public double getArea() {
        return PI * Math.pow(radius, 2);
    }
}
