package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class Company {
    private Employee[] employees;

    public Company(int n) {
        employees = new Employee[n];
    }

    public Company(Employee ... employees) {
        this.employees = new Employee[employees.length];
        this.employees = employees;
    }

    public void giveEverybodyBonus(BigDecimal companyBonus){
        for (int i=0; i<employees.length; i++)
        {
            employees[i].setBonus(companyBonus);
        }
    }

    public BigDecimal totalToPay() {
        BigDecimal result = BigDecimal.ZERO;

        for (int i = 0; i < employees.length; i++) {
            result = result.add(employees[i].toPay());
        }
        return result;
    }

    public String nameMaxSalary() {
        String name = null;
        for (int i = 0; i < employees.length-1; i++) {
            if (employees[i].getSalary().compareTo(employees[i+1].getSalary()) > 0) {
                name = employees[i].getName();
            }
        }
        return name;
    }
}