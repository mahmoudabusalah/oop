package oop.OOP2_week7;

public class Facade {
    private SubSystem1 subsystem1;
    private SubSystem2 subsystem2;

    public Facade() {
        this.subsystem1 = new SubSystem1();
        this.subsystem2 = new SubSystem2();
    }

    public void operation() {
        System.out.println("Facade is coordinating the subsystems:");
        subsystem1.operation1();
        subsystem2.operation2();
    }
}

