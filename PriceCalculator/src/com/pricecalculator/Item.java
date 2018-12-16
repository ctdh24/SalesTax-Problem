/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pricecalculator;

import java.math.BigDecimal;

/**
 *
 * @author Calvin Huynh
 */
public class Item {
    private String itemName;
    private int NumberOf;
//    private ItemType itemType;
    private boolean applySalesTax; //false for food, books, medicine. True for everything else
    private BigDecimal price;
    private boolean imported;
       
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getNumberOf() {
        return NumberOf;
    }

    public void setNumberOf(int NumberOf) {
        this.NumberOf = NumberOf;
    }

//    public ItemType getItemType() {
//        return itemType;
//    }
//
//    public void setItemType(ItemType itemType) {
//        this.itemType = itemType;
//    }

    public boolean isApplySalesTax() {
        return applySalesTax;
    }

    public void setApplySalesTax(boolean applySalesTax) {
        this.applySalesTax = applySalesTax;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }
    
    public void printItem(){
        System.out.println("Item Name: " + this.getItemName());
        System.out.println("Number of items: " + this.getNumberOf());
        System.out.println("Apply sales tax: " + this.isApplySalesTax());
        System.out.println("Is imported: " + this.isImported());
        System.out.println("Price: " + this.getPrice());
    }
    
}
