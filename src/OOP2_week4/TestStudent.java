package OOP2_week4;

public class TestStudent {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setId(10);
        std1.setName("AbuSalah");
        std1.setGpa(3.2);
/////////////////////////////////////
        Student std2 = new Student(15, "Mahmoud", 3.4);
        /////////////////////////////////////
        Student std3 = new Student();
        std3.withId(8).withName("KI-RA").withGpa(3.5);
        std2.withEmail("abu2004salah@gmail.com");//I Can Write It With withs In Line 13
        std3.getId();
    }
}

