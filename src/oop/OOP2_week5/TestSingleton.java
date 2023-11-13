package oop.OOP2_week5;

public class TestSingleton {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Singleton r = Singleton.getInstance();
            System.out.print(i + ") ");
            r.hello();
        }
    }
}
