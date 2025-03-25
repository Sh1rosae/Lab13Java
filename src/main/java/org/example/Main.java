package org.example;

public class Main{
    public static void main(String[] args) {
        Tester tester1 = new Tester("Ivan");
        System.out.println(tester1.toString());
        Tester tester2 = new Tester("Arseniy", "Serzhan", 3);
        System.out.println(tester2.toString());
        Tester tester3 = new Tester("Timur", "Kaskevich", 5, "Advanced", 1500.0);
        System.out.println(tester3.toString());
        tester1.setSalary(1000.0);
        tester2.setSalary(1200.0, 200.0);
        tester3.setSalary(1800.0, 300.0, 150.0);
        Tester.printTesterInfo();
    }
}
