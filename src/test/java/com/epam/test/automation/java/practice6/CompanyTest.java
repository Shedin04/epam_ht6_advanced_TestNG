package com.epam.test.automation.java.practice6;

import org.testng.*;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class CompanyTest {
    private BigDecimal result = null;
    private int n = 2;
    Employee[] employee = new Employee[3];
    Company company = new Company(employee);

    @Test
    public void test1() {
        employee[0] = new Manager("Manager", BigDecimal.valueOf(5000), 500);
        employee[1] = new SalesPerson("Saller1", BigDecimal.valueOf(4500), 150);
        employee[2] = new SalesPerson("Saller2", BigDecimal.valueOf(4500), 300);
        Assert.assertEquals(company.nameMaxSalary(), "Manager");
    }

    @Test
    public void test2() {
        employee[0] = new Manager("Manager", BigDecimal.valueOf(5000), 500);
        employee[1] = new SalesPerson("Saller1", BigDecimal.valueOf(4500), 150);
        employee[2] = new SalesPerson("Saller2", BigDecimal.valueOf(4500), 300);
        employee[0].setBonus(BigDecimal.valueOf(10));
        employee[1].setBonus(BigDecimal.valueOf(10));
        employee[2].setBonus(BigDecimal.valueOf(10));
        Assert.assertEquals(company.totalToPay(), BigDecimal.valueOf(15060));
    }

    @Test
    public void test3() {
        employee[0] = new Manager("Manager", BigDecimal.valueOf(5000), 500);
        employee[1] = new SalesPerson("Saller1", BigDecimal.valueOf(4500), 150);
        employee[2] = new SalesPerson("Saller2", BigDecimal.valueOf(4500), 300);
        company.giveEverybodyBonus(BigDecimal.valueOf(500));
        Assert.assertEquals(employee[0].getBonus(), BigDecimal.valueOf(500 + 1000));
    }

    @Test
    public void test4() {
        employee[0] = new Manager("Manager", BigDecimal.valueOf(5000), 500);
        employee[1] = new SalesPerson("Saller1", BigDecimal.valueOf(4500), 150);
        employee[2] = new SalesPerson("Saller2", BigDecimal.valueOf(4500), 300);
        company.giveEverybodyBonus(BigDecimal.valueOf(500));
        Assert.assertEquals(company.totalToPay(), BigDecimal.valueOf(18000));
    }
}
