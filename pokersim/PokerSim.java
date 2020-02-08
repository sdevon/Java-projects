
package pokersim;

import java.util.*;
/*
 * @author Devon
 */
public class PokerSim {

   
    public static void main(String[] args) {

	Scanner inputInt = new Scanner(System.in);
	Scanner inputString = new Scanner(System.in);
	ArrayList<Card> hand = new ArrayList<Card>();
	Deck deck = new Deck();
	Card card;
	Points markHand;
	int choice;
	String disCardRank;
	String disCardSuit;
	int disCard = 0;
	String anotherRemove = "";
	int javaDollarsRemaining = 0;
	int javaDollars = 3;
	int timesPlayed = 0;
	final int COSTOFPLAYING = 1; 
	String playAgain = "";
		
		
	System.out.println("Welcome to Video Poker");
	System.out.print("Enter 1 To Pay Token and Start Game");
	choice = inputInt.nextInt();
		
	System.out.println();
		
	if (choice == 1) { 
            do {
		hand = new ArrayList<Card>();
		deck = new Deck();
		card = new Card("", "");
				
		timesPlayed++;
		deck.createDeck();
		deck.shuffleDeck();
		hand = deck.dealHand();
		System.out.println("Your Cards:");
		for (int i = 0; i < hand.size(); i++) {
                    card = hand.get(i);
                    System.out.println(card.getRanks() + " " + card.getSuits());
		}
		
		System.out.print("Remove all cards, some cards, or none: [1=All, 2=Some, 3=None]: ");
		choice = inputInt.nextInt();
		
		if (choice == 1) {
                    hand = deck.dealHand();
                    System.out.println("Your hand now contrains:");
                    for (int i = 0; i < hand.size(); i++) {
			card = hand.get(i);
			System.out.println(card.getRanks() + " " + card.getSuits());
                    }			
		} 
                
                else if (choice == 2) {
                    disCard = 0;
                    do {
			disCard++;
			System.out.println("What cards would you like to discard? ");
			System.out.print("Enter Card Number/Rank: ");
			disCardRank = inputString.nextLine();
			System.out.print("Enter Suit: ");
			disCardSuit = inputString.nextLine();
			System.out.println("");
			for (int i = 0; i < hand.size(); i++) {
                            card = hand.get(i);
                            if (card.getRanks().equalsIgnoreCase(disCardRank) && card.getSuits().equalsIgnoreCase(disCardSuit)) {
				hand.remove(i);
				hand.add(deck.getCard());
				break;
                            }
                            if (i == 4) {
                                System.out.println("Card can not be found");
                                disCard--;
                            }
			}
                        
			System.out.println("You're cards: ");
                        for (int i = 0; i < hand.size(); i++) {
                            card = hand.get(i);
                            System.out.println(card.getRanks() + " " + card.getSuits());
                        }
			System.out.print("Would you like to remove another card?[Y = Yes, N = No] ");
			anotherRemove = inputString.nextLine();
                    }while((anotherRemove.equalsIgnoreCase("Yes") || anotherRemove.equalsIgnoreCase("Y")) && disCard!=5);
                    if (disCard == 5) {
			System.out.println();
			System.out.println("You can not change anymore cards, only 5 cards can be changed.");
			System.out.println("--------------------------------------------------------------");
                    }
		} 
                else{
                    System.out.println("No cards Removed");
		}
				
                markHand = new Points(hand);
                markHand.givePoints();
                System.out.println();
		System.out.println("Type of Hand: " + markHand.getTypeOfHandValue());
		System.out.println("Amount won: " + markHand.getAmountOfJavaDollars() + " Points");
		javaDollars += markHand.getAmountOfJavaDollars();
		javaDollarsRemaining = javaDollars-(timesPlayed*COSTOFPLAYING);
		System.out.println("Total Profit [minus cost of playing]: " + javaDollarsRemaining + " Points");
				
		System.out.print("Would you like to play again: [Y = Yes, N = No] ");
		playAgain = inputString.nextLine();
		System.out.println();
            }while((playAgain.equalsIgnoreCase("Yes") || playAgain.equalsIgnoreCase("Y")) && javaDollarsRemaining >0);
            
            if (javaDollarsRemaining == 0) {
		System.out.println("You have no more Points.");
            } 
            else {
		System.out.println("Quiting the game");
		System.out.println("Total Profit [minus cost of playing]: " + javaDollarsRemaining + " Points");
            }
	} 
        
	else {
            System.out.println("Unknown Number Closing Game");
	}
		
	inputInt.close();
	inputString.close();
    }   
}