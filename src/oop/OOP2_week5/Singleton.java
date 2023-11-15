package oop.OOP2_week5;

import java.sql.SQLOutput;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("New object has been created :)");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void hello() {
        System.out.println("Hello from singleton");
    }

}
