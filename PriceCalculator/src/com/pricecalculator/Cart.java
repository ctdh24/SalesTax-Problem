/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pricecalculator;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Calvin Huynh
 */
public class Cart {
    private Map<Item, Integer> order = new HashMap<Item, Integer>();
    
    public void putIntoCart(Item item, int number){
        Integer i = this.order.get(item);
        if (i != null) number += i;
        this.order.put(item, number);
    }
    
}
