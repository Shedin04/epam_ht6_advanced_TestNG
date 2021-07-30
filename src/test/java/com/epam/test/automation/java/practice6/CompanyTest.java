package com.epam.test.automation.java.practice6;

import org.testng.*;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class CompanyTest {
    private BigDecimal result = null;
    private int n=2;

    @Test
    public void test1() {
        n=2;
        Company company = new Company(n);
        SalesPerson [] seller = new SalesPerson[n];
        seller[0] = new SalesPerson("First",new BigDecimal(100),100);
        seller[1] = new SalesPerson("Second",new BigDecimal(150),75);
        Assert.assertEquals(seller[0].getName(), "First");
    }
}
