/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pricecalculator;

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
        fail("The test case is a prototype.");
    }

    /**
     * Test of correctInput method, of class ReadList.
     */
    @Test
    public void testCorrectInput() {
        System.out.println("correctInput");
        String order = "";
        boolean expResult = false;
        boolean result = ReadList.correctInput(order);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItem method, of class ReadList.
     */
    @Test
    public void testSetItem() {
        System.out.println("setItem");
        String order = "1 book at 12.49";
        Item expResult = null;
        Item result = ReadList.setItem(order);
        System.out.println("Item Name: " + result.getItemName());
        System.out.println("Number of items: " + result.getNumberOf());
        System.out.println("Price: " + result.getPrice());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parse method, of class ReadList.
     */
    @Test
    public void testParse() {
        System.out.println("parse");
        String order = "";
        Matcher expResult = null;
        Matcher result = ReadList.parse(order);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
