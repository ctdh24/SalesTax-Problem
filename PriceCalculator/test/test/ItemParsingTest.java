/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import com.pricecalculator.ReadList;

/**
 *
 * @author Calvin Huynh
 */
public class ItemParsingTest {
    public void testFile(){
        ReadList.getFromFile("source/Input13.txt");
    }
}
