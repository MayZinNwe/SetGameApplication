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
public class FirstWorkShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Deck myDeck = new Deck();
        CardOnTable card= new CardOnTable();
//        myDeck.showCards();
//        myDeck.shuffle();
//        myDeck.showCards();
        card.showOnTable();
        card.select3Card();
        
    }
    
}
