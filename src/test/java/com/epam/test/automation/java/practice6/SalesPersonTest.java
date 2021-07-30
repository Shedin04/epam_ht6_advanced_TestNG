package com.epam.test.automation.java.practice6;

import org.testng.*;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class SalesPersonTest {
    private int result;

    @Test
    public void test1(){
        SalesPerson sales = new SalesPerson("Name",new BigDecimal(100),100);
        sales.setBonus(new BigDecimal(100));
        BigDecimal result = new BigDecimal(100);
        Assert.assertEquals(result, sales.getBonus());
    }

    @Test
    public void test2(){
        SalesPerson sales = new SalesPerson("Name",new BigDecimal(100),101);
        sales.setBonus(new BigDecimal(100));
        BigDecimal result = new BigDecimal(100*2);
        Assert.assertEquals(result, sales.getBonus());
    }

    @Test
    public void test3(){
        SalesPerson sales = new SalesPerson("Name",new BigDecimal(100),201);
        sales.setBonus(new BigDecimal(100));
        BigDecimal result = new BigDecimal(100*3);
        Assert.assertEquals(result, sales.getBonus());
    }
}