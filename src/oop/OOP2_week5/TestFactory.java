package oop.OOP2_week5;

public class TestFactory {
    public static void main(String[] args) {
        FactoryText f = new FactoryText();
        A a1 = f.create(1);
        A a2 = f.create(2);
        B b1 = (B) a1;
        a1.m1();
        b1.m2();
    }

}
