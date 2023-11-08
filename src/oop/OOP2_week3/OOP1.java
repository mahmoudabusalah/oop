package oop.OOP2_week3;

public class OOP1 {
    public static void main(String arg[]) {
        Person p1 = new Person();
        p1.name = "AbuSalah";
        p1.sayHello();

        Person p2 = new Person();
        p2.name = "KI-RA";
        p2.sayHello();

        Person p3 = p1;
        p3.name = "Mahmoud";
        p3.sayHello();
        p1.sayHello();//The output should be "Mahmoud"

        Person p4 = null;
        p4.name = "Jalal";
        p4.sayHello();// when i make run it should be ==> NullPointerException

    }
}
