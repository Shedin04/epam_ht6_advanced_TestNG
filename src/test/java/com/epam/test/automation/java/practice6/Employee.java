package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public abstract class Employee implements Info {
    private String name;
    private BigDecimal salary;
    protected BigDecimal bonus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        if (salary.compareTo(new BigDecimal(0)) < 0) throw new NullPointerException();
        this.salary = salary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public abstract void setBonus(BigDecimal bonus);

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public BigDecimal toPay()
    {
        BigDecimal bonus = getBonus();
        if (bonus == null) bonus=BigDecimal.ZERO;
        return getSalary().add(bonus);
    }

    @Override
    public void showInfo(){}
}