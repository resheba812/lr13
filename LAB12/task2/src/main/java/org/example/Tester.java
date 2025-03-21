package org.example;

public class Tester {
    public String name;
    public String surname;
    public int experienceInYears;
    public String englishLevel;
    public double salary;

    public Tester(String name, String surname) {
        this(name, surname, 3, "C2", 1000);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "B1", 800);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println(name + " " + surname + " - опыт: " + experienceInYears + " лет");
    }

    public void displayInfo(boolean fullInfo) {
        if (fullInfo) {
            System.out.println(name + " " + surname + ", опыт: " + experienceInYears + ", Английский: " + englishLevel + ", Зарплата: " + salary);
        } else {
            displayInfo();
        }
    }

    public void displayInfo(int bonus) {
        System.out.println(name + " " + surname + " получил бонус: " + bonus);
    }

    public static void companyInfo() {
        System.out.println("Компания: международная IT-компания");
    }
}
