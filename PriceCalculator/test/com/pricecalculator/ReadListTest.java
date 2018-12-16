/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pricecalculator;

import java.math.BigDecimal;
import java.util.regex.Matcher;
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
public class ReadListTest {
    
    public ReadListTest() {
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
     * Test of getFromFile method, of class ReadList.
     */
    @Test
    public void testGetFromFile() {
        System.out.println("getFromFile");
        String filename = "sourceFiles/Input13.txt";
        ReadList.getFromFile(filename);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setItem method, of class ReadList. 
     * Verify that it creates an Item correctly
     */
    @Test
    public void testSetItem() {
        System.out.println("setItem");
        String order = "1 imported book at 12.49";
        Item result = ReadList.setItem(order);
        result.printItem();
        assertEquals(result.getItemName(), "imported book");
        assertEquals(result.getNumberOf(), 1);
        assertEquals(result.isApplySalesTax(), false);
        assertEquals(result.isImported(), true);
        assertEquals(result.getPrice(), new BigDecimal("12.49"));
    }
}
