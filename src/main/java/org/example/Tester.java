package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    private static int testerCount = 0;

    public Tester(String name) {
        this(name, "Unknown", 0, "Unknown", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Unknown", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
        testerCount++;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSalary(double salary, double bonus) {
        this.salary = salary + bonus;
    }

    public void setSalary(double salary, double bonus, double tax) {
        this.salary = salary + bonus - tax;
    }

    @Override
    public String toString() {
        return "Tester Info: " + name + " " + surname + ", Experience: " +
                experienceInYears + " years, English Level: " + englishLevel +
                ", Salary: $" + salary;
    }

    public static void printTesterInfo() {
        System.out.println("Total Testers Created: " + testerCount);
    }
}
