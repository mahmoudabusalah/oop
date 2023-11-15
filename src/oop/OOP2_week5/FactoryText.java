package oop.OOP2_week5;

public class FactoryText {
    public A create(int type) {
        if (type == 1) {
            return new B();
        } else if (type == 2) {
            return new C();
        } else {
            return null;
        }
    }
}

