/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pricecalculator;

/**
 *
 * @author Calvin Huynh
 */
public class PriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length == 0)
	{
            System.exit(0);
        }
        for (String fileName: args) ReadList.getFromFile(fileName);
    }
    
}
