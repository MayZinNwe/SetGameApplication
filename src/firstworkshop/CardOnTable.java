package firstworkshop;

import java.util.Scanner;

public class CardOnTable {

    int deckArray;
    Card[] selectCard = new Card[3];
    Card[] cardOnTable = new Card[12];
    Card[] Cardfor81 = new Card[81];
    Deck deck = new Deck();
    SetEngine set = new SetEngine();
    int[] input = new int[3];
    Card c1 = new Card();
    Card c2 = new Card();
    Card c3 = new Card();

    public void showOnTable() {
        deck.shuffle();
        deck.showCards();
        System.out.println(">>>>>> Card on the Deck <<<<<<<<<<<");
        for (deckArray = 0; deckArray < cardOnTable.length; deckArray++) {
            cardOnTable[deckArray] = deck.gameCards[deckArray];
            deck.gameCards[deckArray] = null;
            System.out.println("Card On Table " + deckArray + " : " + cardOnTable[deckArray]);
        }

    }

    public void select3Card() {
        int play = 1;
        do {
            Scanner scanIn1 = new Scanner(System.in);
            int selectedNumber;
            for (int i = 0; i < selectCard.length; i++) {
                System.out.println("Plese choose the number between 0 to 11: ");
                selectedNumber = scanIn1.nextInt();
                input[i] = selectedNumber;
                selectCard[i] = cardOnTable[selectedNumber];
            }
            c1 = selectCard[0];
            c2 = selectCard[1];
            c3 = selectCard[2];

            boolean a = set.isSet(c1, c2, c3);
            if (a == true) {
                System.out.println("Your selected Cards are set.");
                removeAndReplaceCard();
            } else {
                System.out.println("Your selected Cards are not set.");
            }
            System.out.println("If continute, please enter 1: ");
            Scanner exit = new Scanner(System.in);
            play = exit.nextInt();
            showCardOnTable();
        } while (play == 1 && deckArray <= 80);
        System.out.println("Thanks");
    }

    public void removeAndReplaceCard() {
        int number;
        if (deckArray <= 80) {
            for (int i = 0; i < input.length; i++) {
                number = input[i];
                cardOnTable[number] = deck.gameCards[deckArray];
                deck.gameCards[deckArray] = null;
                deckArray++;
            }
        } else {
            System.out.println("The Card on the deck is empty");
        }

    }

    public void showCardOnTable() {
        System.out.println(">>>>>>>>>>>Card on The Table<<<<<<<<<<<");
        for (int i = 0; i < cardOnTable.length; i++) {
            System.out.println("Card : "+ cardOnTable[i]);
        }
    }

}
