package cardgame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    //fields
    ArrayList<Card> cards = new ArrayList<>();

    //constructors
    public Deck() {
        String suit = "";

        for (int i = 1; i <= 4; i++) {
            //switch op i
            switch (i) {
                case 1:
                    suit = "hearts";
                    break;
                case 2:
                    suit = "clubs";
                    break;
                case 3:
                    suit = "spades";
                    break;
                case 4:
                    suit = "diamonds";
                    break;
            }
            for (int j = 2; j <= 10; j++) {
                Card c = new Card(suit, Integer.toString(j), j);
//             <object_name> . <method_name> (optioneel: parameters);
                cards.add(c);
            }

            Card jack = new Card(suit, "jack", 11);
            Card queen = new Card(suit, "queen", 12);
            Card king = new Card(suit, "king", 13);
            Card ace = new Card(suit, "ace", 14);

            cards.add(jack);
            cards.add(queen);
            cards.add(king);
            cards.add(ace);
        }
        Collections.shuffle(cards);

    }

    //getters/setters
    public ArrayList<Card> getCards() {

    	return cards;
    }

    public Card getNextCard() {
    	return cards.remove(0);
    }

    //methods
}
