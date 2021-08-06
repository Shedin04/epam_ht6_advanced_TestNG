package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;
//import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[3];
        Company company = new Company(employee);

        employee[0] = new Manager("Kolya", BigDecimal.valueOf(5000), 500);
        employee[1] = new SalesPerson("Nick", BigDecimal.valueOf(4500), 150);
        employee[2] = new SalesPerson("Alex", BigDecimal.valueOf(4500),300);

        for (Employee value : employee) value.showInfo();
        System.out.println("[        Total to pay: " + company.totalToPay() + " | Max salary: " + company.nameMaxSalary() + "        ]");

        BigDecimal everybonus = BigDecimal.valueOf(500); company.giveEverybodyBonus(everybonus);
        System.out.println("\nSet EverybodyBonus: " + everybonus + "\n");

        for (Employee value : employee) value.showInfo();
        System.out.println("[        Total to pay: " + company.totalToPay() + " | Max salary: " + company.nameMaxSalary() + "        ]");
        System.out.println("\n/*Static test:*/");
        Company.temp = "|"; // изменяем static переменную
        final int n = 2; // не смогу переприсвоить
        Company.getInfo(n);

        System.out.println("\n/*Interfaces:*/");
        new Manager("Shedin", BigDecimal.valueOf(2000), 3).showInfo();
        new SalesPerson("Boll", BigDecimal.valueOf(3100), 151).showInfo();
    }
}