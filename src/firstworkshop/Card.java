/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firstworkshop;

/**
 *
 * @author MZN
 */
public class Card {
   String color;
    String symbol;
    String shading;
    String number;

     public Card() {
       
    }
    
    public Card(String color, String symbol, String shading, String number) {
        this.color = color;
        this.symbol = symbol;
        this.shading = shading;
        this.number = number;
    }

    
    @Override
    public String toString() {
        return "Card{" + "color=" + color + ", symbol=" + symbol + ", shading=" + shading + ", number=" + number + '}';
    }

} 

