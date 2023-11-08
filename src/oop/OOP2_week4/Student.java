package oop.OOP2_week4;

public class Student {
    private int id;
    private String name, email;
    private double gpa;

    public Student() {

    }

    public Student(int id, String name, double gpa) {
        setId(id);
        setName(name);
        setGpa(gpa);
    }

    ///////////////////////////////////////////
    public Student withId(int id) {
        setId(id);
        return this;
    }

    public Student withName(String name) {
        setName(name);
        return this;
    }

    public Student withGpa(double gpa) {
        setGpa(gpa);
        return this;
    }

    public Student withEmail(String email) {
        setEmail(email);
        return this;
    }

    ///////////////////////////////////////////
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getEmail() {
        return email;
    }
}
