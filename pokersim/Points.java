
package pokersim;

import java.util.*;

/**
 * @author Devon
 */
public class Points {
    
    Card card;
    ArrayList<Card> hand = new ArrayList<Card>();
    ArrayList<Integer> rankHand = new ArrayList<Integer>();
    ArrayList<String> suitHand = new ArrayList<String>();
    int[] ranks = new int[14];

    int Points = 0;
    String typeOfHand = "";
    boolean flush = true;
    int smallGroupRank = 0;
    int largeGroupRank = 0;
    boolean straight = false;
    int topStraightValue = 0;
    boolean royalFlush = false;

	
    public Points(ArrayList<Card> h) {
        hand = h;
    }
	
    public void givePoints() {
	
        for (int i = 0; i < hand.size(); i++) {
            if (hand.get(i).getRanks().equals("Ace")) 
               rankHand.add(1);
            else if (hand.get(i).getRanks().equals("Jack")) 
               rankHand.add(11);
            else if (hand.get(i).getRanks().equals("Queen")) 
               rankHand.add(12);
            else  if (hand.get(i).getRanks().equals("King")) 
               rankHand.add(13);
            else 
               rankHand.add(Integer.parseInt(hand.get(i).getRanks()));
        }
		
	Collections.sort(rankHand);
					
	for (int i = 0; i < hand.size(); i++) {
            suitHand.add(hand.get(i).getSuits());
	}
		
		
	for (int i = 0; i < suitHand.size()-1; i++) {
            if (!suitHand.get(i).equals(suitHand.get(i+1))) {
		flush = false;
        	}
	}
		
	//Check 2 of kind, 3 of kind, or 4 of kind
	for (int i = 0; i <= 13; i++) {
            ranks[i] = 0; 
	}

	for (int x = 0; x < rankHand.size(); x++) {
            ranks[rankHand.get(x)]++;
	}

	int sameCards = 1;
	int sameCards2 = 1;

	for (int x = 13; x >= 1; x--) {
            if (ranks[x] > sameCards) {
		if (sameCards != 1) {
                    sameCards2 = sameCards;
                    smallGroupRank = largeGroupRank;
		}
		sameCards = ranks[x];
		largeGroupRank = x;
            } 
            else if (ranks[x] > sameCards2) {
		sameCards2 = ranks[x];
		smallGroupRank = x;
            }
	}
		
	int sameCardsJacks = 1;
	int sameCards2Jacks = 1;
		
	for (int x = 13; x >= 11; x--) {
            if (ranks[x] > sameCardsJacks) {
		if (sameCardsJacks != 1) {
                    sameCards2Jacks = sameCardsJacks;
                    smallGroupRank = largeGroupRank;
		}
                
            sameCardsJacks = ranks[x];
            largeGroupRank = x;
            } 
            else if (ranks[x] > sameCards2Jacks) {
		sameCards2Jacks = ranks[x];
		smallGroupRank = x;
            }
	}
		
	//Check for Straight
	for (int x = 1; x <= 9; x++) {
            if (ranks[x] == 1 && ranks[x + 1] == 1 && ranks[x + 2] == 1 && ranks[x + 3] == 1 && ranks[x + 4] == 1) {
		straight = true;
		topStraightValue = x+4;
		break;
            }
	}

	if (ranks[10] == 1 && ranks[11] == 1 && ranks[12] == 1 && ranks[13] == 1 && ranks[1] == 1) {
            straight = true;
            royalFlush = true;
	}

		
	if (flush){
            if (royalFlush){
		Points = 250;
		typeOfHand = "Royal Flush";
            } 
            else if (straight){
				Points = 50;
				typeOfHand = "Straight Flush";
            } 
            else{
		Points =5;
		typeOfHand = "Flush";
            }
	} 
        else if (sameCards == 4) { //Four of a kind
            Points = 25;
            typeOfHand = "Four of a Kind";
	} 
        else if (sameCards == 3 && sameCards2 == 2) { //Full house
            Points =6;
            typeOfHand = "Full House";
	} 
        else if (straight) { //Straight
            Points =4;
            typeOfHand = "Straight";
	} 
        else if (sameCards == 3 && sameCards2!=2) { //Three of a kind
            Points =3;
            typeOfHand = "Three of a Kind";
	} 
        else if (sameCards == 2 && sameCards2 == 2) { //Two Pairs
            Points = 2;
            typeOfHand = "Two Pairs";
	} 
        else if (sameCardsJacks == 2 && sameCards2Jacks==1) { //One Pair
            Points =1;
            typeOfHand = "One Pair";
	} 
        else { 
            Points = 0;
            typeOfHand = "No pair";
	}

    }
	

    public int getAmountOfJavaDollars() {
	return Points;
    }
	
	
    public String getTypeOfHandValue() {
	return typeOfHand;
    }
    
}