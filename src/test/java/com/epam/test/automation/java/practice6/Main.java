package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Scanner text = new Scanner(System.in);
//        System.out.print("- Введите к-во работников: ");
//        int n = input.nextInt();
        Employee[] employee = new Employee[3];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Работник номер " + (i + 1) + ": ");
//            System.out.print("- Выберите тип (1-Manager; 2-SalesPerson): "); int type = input.nextInt();
//            if (type == 1) {
//                employee[i] = new Manager("Manager", BigDecimal.valueOf(0), 0);
//            } else {
//                employee[i] = new SalesPerson("SalesPerson", BigDecimal.valueOf(0), 0);
//            }
//            System.out.print("- " + employee[i].getName() + "[" + i + "] Name: "); employee[i].setName(text.nextLine());
//            System.out.print("- " + employee[i].getName() + "[" + i + "] Salary: "); employee[i].setSalary(BigDecimal.valueOf(input.nextInt()));
//            System.out.print("- " + employee[i].getName() + "[" + i + "] Bonus: "); employee[i].setBonus(BigDecimal.valueOf(input.nextInt()));
//            System.out.println();
//        }
        employee[0] = new Manager("Manager", BigDecimal.valueOf(5000), 500);
        employee[1] = new SalesPerson("Saller1", BigDecimal.valueOf(4500), 150);
        employee[2] = new SalesPerson("Saller2", BigDecimal.valueOf(4500),300);

        Company company = new Company(employee);
        System.out.println("===============================");
        System.out.println("- Max Salary: " + company.nameMaxSalary());
        employee[0].setBonus(BigDecimal.valueOf(10)); System.out.println("-- Bonus of Manager: " + employee[0].getBonus());
        employee[1].setBonus(BigDecimal.valueOf(10)); System.out.println("-- Bonus of Saller1: " + employee[1].getBonus());
        employee[2].setBonus(BigDecimal.valueOf(10)); System.out.println("-- Bonus of Saller2: " + employee[2].getBonus());
        System.out.println("--- Manager to Pay: " + employee[0].toPay());
        System.out.println("--- Saller1 to Pay: " + employee[1].toPay());
        System.out.println("--- Saller2 to Pay: " + employee[2].toPay());
        System.out.println("---- Total to Pay: " + company.totalToPay());
        System.out.println("===============================");

        company.giveEverybodyBonus(BigDecimal.valueOf(500));
        System.out.println("-- Bonus of Manager: " + employee[0].getBonus());
        System.out.println("-- Bonus of Saller1: " + employee[1].getBonus());
        System.out.println("-- Bonus of Saller2: " + employee[2].getBonus());
        System.out.println("--- Manager to Pay: " + employee[0].toPay());
        System.out.println("--- Saller1 to Pay: " + employee[1].toPay());
        System.out.println("--- Saller2 to Pay: " + employee[2].toPay());
        System.out.println("---- Total to Pay: " + company.totalToPay());
    }
}