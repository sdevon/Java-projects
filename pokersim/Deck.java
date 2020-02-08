
package pokersim;

import java.util.*;
/**
 * @author Devon
 */
public class Deck {
    

    ArrayList<Card> deckOfCards = new ArrayList<Card>();
    ArrayList<Card> hand = new ArrayList<Card>();
    Card card;
    String[] rankTester;
    String[] suitTester;
	
		
    public Deck() {
    }
    
    public Deck(String[] r, String[] s) {
        rankTester = r;
        suitTester = s;
    }
	
	
    public void createDeck() {
	String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	for (int i = 0; i < ranks.length; i++) {
            for (int x = 0; x < suits.length; x++) {
		Card card = new Card(ranks[i], suits[x]);
		deckOfCards.add(card);
            }
	}
    }
	
	
    public void createDeckTester() {
	for (int i = 0; i < rankTester.length; i++) {
            Card card = new Card(rankTester[i], suitTester[i]);
            deckOfCards.add(card);
	}
    }

	
    public void shuffleDeck() {
	Collections.shuffle(deckOfCards);
    }
	
	
    public ArrayList<Card> dealHand() {
	if (hand.size() > 0) {
            hand.remove(0);
            hand.remove(0);
            hand.remove(0);
            hand.remove(0);
            hand.remove(0);
	}
	for (int i=0; i < 5; i++) {
            hand.add(deckOfCards.get(0));
            deckOfCards.remove(0);
	}
	return hand;	
    }

    public Card getCard() {
        Card giveCard;
        giveCard = deckOfCards.get(0);
        deckOfCards.remove(0);
        return giveCard;
    }
	
    public ArrayList<Card> printDeck() {
        return deckOfCards;
    }
	

    public ArrayList<Card> printHand() {
	return hand;
    }
    
    
}