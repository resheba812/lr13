package org.example;

public class Main {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Роман", "Парфенов");
        Tester tester2 = new Tester("Прохор", "Соколов", 5);
        Tester tester3 = new Tester("Ян", "Зенькович", 10, "C1", 2000);

        tester1.displayInfo();
        tester2.displayInfo(true);
        tester3.displayInfo(100);

        Tester.companyInfo();
    }
}