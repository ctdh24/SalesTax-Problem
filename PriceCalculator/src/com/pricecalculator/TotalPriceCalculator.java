/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pricecalculator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author Calvin Huynh
 */
public class TotalPriceCalculator {
    private static final BigDecimal rounding = new BigDecimal("0.05");
    
    public static BigDecimal calculateSalesTax(Item item){
        BigDecimal salesTax = BigDecimal.ZERO;
        if(item.isApplySalesTax()){
            salesTax = item.getPrice().multiply(new BigDecimal(item.getNumberOf()));
            salesTax = salesTax.multiply(new BigDecimal("0.10"));
            salesTax = salesTax.multiply(new BigDecimal("20")).setScale(0, RoundingMode.UP).setScale(2);
            salesTax = salesTax.divide(new BigDecimal("20"), RoundingMode.UP);
        }
        return salesTax;
    }
    
    public static BigDecimal calculateImportTax(Item item){
        BigDecimal importTax = BigDecimal.ZERO;
        if(item.isImported()){
            importTax = item.getPrice().multiply(new BigDecimal(item.getNumberOf()));
            importTax = importTax.multiply(new BigDecimal("0.05"));
            importTax = importTax.multiply(new BigDecimal("20")).setScale(0, RoundingMode.UP).setScale(2);
            importTax = importTax.divide(new BigDecimal("20"), RoundingMode.UP);
        }
        return importTax;
    }
    
    public static BigDecimal calculatePrice(Item item){
        BigDecimal calculatedPrice = item.getPrice().add(calculateSalesTax(item).add(calculateImportTax(item)));        
        return calculatedPrice;
    }
}
