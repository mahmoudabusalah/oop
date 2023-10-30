package OOOP_week3;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Area: " + c1.getArea(3));
        System.out.println("Round: " + c1.getRound(3));

        Circle c2 = new Circle();
        System.out.println("Area: " + c2.getArea(10));
        System.out.println("Round: " + c2.getRound(10));
    }

}

