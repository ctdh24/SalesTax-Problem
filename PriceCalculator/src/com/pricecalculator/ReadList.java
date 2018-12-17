/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pricecalculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Calvin Huynh
 */
public class ReadList {
    // parse string 
    private static final String itemRegex = "(\\d+)\\s((\\w+\\s)+)at\\s(\\d+.\\d+)";
    // using hash set to quickly look for things in a set list. O(1) complexity to look up
    // assuming that there is a cataloged list of set items
    private static Set<String> noSalesTaxItems = null;
    static{
        noSalesTaxItems = new HashSet<String>();
        noSalesTaxItems.add("book");
        noSalesTaxItems.add("imported book");
        noSalesTaxItems.add("chocolate bar");
        noSalesTaxItems.add("imported box of chocolates");
        noSalesTaxItems.add("box of imported chocolates");
        noSalesTaxItems.add("packet of headache pills");
        noSalesTaxItems.add("pills");
    }
    
    public static void getFromFile(String filename){
        List<Item> items = new ArrayList();
        try{
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String str;
            while((str = in.readLine()) != null)
            {
                if(correctInput(str)){
                    Item item = new Item();
                    item = setItem(str);
                    //System.out.println(str);
                    items.add(item);
                }
                    
            }
            in.close();
        }
        catch(IOException e){
            System.out.println("error: " + e);
        }
        finalOutput(items);
    }
    //look for correct input
    public static boolean correctInput(String order){
        return Pattern.matches(itemRegex, order);
    }
    
    public static Item setItem(String order){
        Item item = new Item();
        Matcher m = parse(order);
        item.setItemName(m.group(2).trim());
        item.setNumberOf(Integer.valueOf(m.group(1)));
        item.setPrice(new BigDecimal(m.group(4).trim()));
        //see if it is imported
        if(item.getItemName().contains("imported")) 
            item.setImported(true);
        else
            item.setImported(false);
        
        //see if it is an exempted item
        if(noSalesTaxItems.contains(item.getItemName()))
            item.setApplySalesTax(false);
        else
            item.setApplySalesTax(true);
        
        return item;
    }
    
    public static Matcher parse(String order){
        Pattern pattern = Pattern.compile(itemRegex);
        Matcher matcher = pattern.matcher(order);
        matcher.find();
        return matcher;
    }
    
    public static void finalOutput(List<Item> items){
        BigDecimal totalTax = BigDecimal.ZERO;
        BigDecimal totalPriceWithTax = BigDecimal.ZERO;
        for (Item i : items){
            BigDecimal salesTax = TotalPriceCalculator.calculateSalesTax(i);
            BigDecimal importTax = TotalPriceCalculator.calculateImportTax(i);
            totalTax = totalTax.add(salesTax.add(importTax));
            BigDecimal totalPrice = TotalPriceCalculator.calculatePrice(i);
            totalPriceWithTax = totalPriceWithTax.add(totalPrice);
            System.out.println(i.getNumberOf()+" "+i.getItemName()+": "+totalPrice);
        }
        System.out.println("Sales tax: " + totalTax);
        System.out.println("Total: " + totalPriceWithTax);
        System.out.println();
    }
}
