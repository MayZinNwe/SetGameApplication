/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firstworkshop;

import java.util.Arrays;
import java.util.Collections;


public class Deck {

    public Card[] gameCards = new Card[81];
    int topCard;
//    int counter = 0;
//    private final String[] colors = {"Red", "Purple", "Green"};
//    public static final String[] symbols = {"Squiggle", "Diamond", "Oval"};
//    public static final String[] shadings = {"Solid", "Striped", "Outline"};
//    public static final String[] numbers = {"One", "Two", "Three"};
    public Deck(){
//    Card[] gameCards = new Card[81];
    int counter = 0;
    final String[] colors = {"Red", "Purple", "Green"};
    final String[] symbols = {"Squiggle", "Diamond", "Oval"};
    final String[] shadings = {"Solid", "Striped", "Outline"};
    final int[] numbers = {1, 2, 3};
        for (String shading : shadings) {
            for (String symbol : symbols) {
                for (String color : colors) {
                    for (int number : numbers) {
                        Card card = new Card(color, symbol, shading, number);
                        gameCards[counter] = card;
                        counter++;
//                        System.out.println(card.toString());
                    }
                }
            }
        }
//        System.out.println(counter);
}
    public void showCards() {
        System.out.println(">>> Showing  SetGame Cards <<<");
        int i=1;
        for(Card c:gameCards) {
            System.out.println("SetGame Card "+(i++)+" : "+c);
            
            
        }
    }
//public Card getcard(int i){   
//Card card=new Card(gameCards[i].color,gameCards[i].number,gameCards[i].shading,gameCards[i].symbol);
//return card;
//}
 
    public void shuffle() {
        int topCard = 0;

        Collections.shuffle(Arrays.asList(gameCards));
}
//
}
