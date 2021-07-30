package com.epam.test.automation.java.practice6;

import org.testng.*;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class ManagerTest {
    private int result;

    @Test
    public void test1(){
        Manager manager = new Manager("Name",new BigDecimal(100),100);
        manager.setBonus(new BigDecimal(35));
        BigDecimal result = new BigDecimal(35);
        Assert.assertEquals(manager.getBonus(),result);
    }

    @Test
    public void test2(){
        Manager manager = new Manager("Name",new BigDecimal(100),151);
        manager.setBonus(new BigDecimal(35));
        BigDecimal result = new BigDecimal(35+1000);
        Assert.assertEquals(manager.getBonus(),result);
    }

    @Test
    public void test3(){
        Manager manager = new Manager("Name",new BigDecimal(100),150);
        manager.setBonus(new BigDecimal(35));
        BigDecimal result = new BigDecimal(35+500);
        Assert.assertEquals(manager.getBonus(),result);
    }
}