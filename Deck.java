package homework;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	//fields 
	private ArrayList<Card> deck;
	private int numDealt;
	
	//constructor: suit and value nested loops
	public Deck(){
		deck = new ArrayList<>();
		
		for (int s = 0; s <4; s++){
			for (int v = 1; v < 14; v++){
				Card newCard = new Card(s,v);
				deck.add(newCard);
			}
		}
	}
	 
	//methods
	
	//shuffle method
	public void shuffleDeck(){
		Collections.shuffle(deck);
	}
	
	//cards remaining method - NEEDS work!!!
	public int cardsRemaining(){	
		return deck.size();
	}
	
	//deal method - pass through dealt #1 ???
	public Card dealCard(){
		Card dealtCard = deck.get(0);
		deck.remove(dealtCard);
		return dealtCard;
		
	}
	

}
