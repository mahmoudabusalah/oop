package oop.OOP2_week3;

public class TestCircle2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(10);
        Circle2 c2 = new Circle2();
        c2.setRadius(-2);
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Area of c2: " + c2.getArea());
    }
}