package com.epam.test.automation.java.practice6;

import org.testng.Assert;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        SalesPerson seller = new SalesPerson("Andy", new BigDecimal(5), 200);
        seller.setBonus(new BigDecimal(45));
        System.out.println("Seller - Name: " + seller.getName() + " | Salary: " + seller.getSalary() + " | Bonus: " + seller.getBonus() + " | Pay: " + seller.toPay());
        Manager manager = new Manager("Tom", new BigDecimal(4), 150);
        manager.setBonus(new BigDecimal(35));
        System.out.println("Manager - Name: " + manager.getName() + " | Salary: " + manager.getSalary() + " | Bonus: " + manager.getBonus() + " | Pay: " + manager.toPay());

        int n=2;
        Employee[] employees = new Employee[n];
        employees[0] = new Manager("First", new BigDecimal(100),131);
        System.out.println(employees[0].getName());
    }
}