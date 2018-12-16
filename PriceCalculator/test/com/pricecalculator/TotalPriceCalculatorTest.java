/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pricecalculator;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Calvin Huynh
 */
public class TotalPriceCalculatorTest {
    
    public TotalPriceCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateSalesTax method, of class TotalPriceCalculator.
     */
    @Test
    public void testCalculateSalesTax() {
        System.out.println("calculateSalesTax");
        String order = "1 imported bottle of perfume at 47.50";
        Item item = ReadList.setItem(order);
        BigDecimal expResult = new BigDecimal("4.75");
        BigDecimal result = TotalPriceCalculator.calculateSalesTax(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculateImportTax method, of class TotalPriceCalculator.
     */
    @Test
    public void testCalculateImportTax() {
        System.out.println("calculateImportTax");
        String order = "1 imported bottle of perfume at 47.50";
        Item item = ReadList.setItem(order);
        BigDecimal expResult = new BigDecimal("2.40");
        BigDecimal result = TotalPriceCalculator.calculateImportTax(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculatePrice method, of class TotalPriceCalculator.
     */
    @Test
    public void testCalculatePrice() {
        System.out.println("calculatePrice");
        String order = "1 imported bottle of perfume at 47.50";
        Item item = ReadList.setItem(order);
        BigDecimal expResult = new BigDecimal("54.65");
        BigDecimal result = TotalPriceCalculator.calculatePrice(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
