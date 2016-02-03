package homework;

import java.nio.channels.NetworkChannel;
import java.util.ArrayList;

public class Hand {
	// fields
	ArrayList<Card> hand;

	// constructor
	public Hand() {
		hand = new ArrayList<>();
	}

	// methods
	// get hand method
	public ArrayList<Card> getHandList() {
		return hand;
	}

	// add card to hand method
	public void addCard(Card c) {
		hand.add(c);
	}

	// logic of hand value method
	public int getValueOfHand() {
		int sum = 0;
		boolean hasAce = false;
		for (Card card : hand) {
			if (card.getValue() == 1) {
				hasAce = true;
				sum = sum + 11;
			} else if (card.getValue() > 10) {
				sum = sum + 10;
			} else {
				sum = sum + card.getValue();
			}
		}
		if (sum > 21 && hasAce){
			sum = sum -10;
		}
		return sum;
	}
	//method to print cards in hand
	public void cardsInHand() {
		for (Card card : hand) {
			System.out.println(card);
		}
	}
	
	//method for show last card dealt
	public Card showLastCard(){
		Card lastCard = hand.get(hand.size()-1);
		System.out.println(lastCard);
		return lastCard ;
		
	}

}
