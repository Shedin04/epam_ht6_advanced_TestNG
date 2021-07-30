package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class SalesPerson extends Employee {
    private int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus==null) throw new IllegalArgumentException();
        if (bonus.compareTo(new BigDecimal(0)) <= 0) throw new IllegalArgumentException();
        if (percent>100 && percent<=200) bonus=bonus.multiply(new BigDecimal(2));
        if (percent >200) bonus=bonus.multiply(new BigDecimal(3));
        this.bonus = bonus;
    }
}