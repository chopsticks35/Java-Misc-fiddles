package homework;

import java.util.ArrayList;

public class Card {
	// fields
	private int suit;
	private int value;

	// constructor
	public Card(int suit, int value) {
		this.suit = suit;
		this.value = value;
	}

	// methods

	// suit to String method
	 public String convertSuit(){
		switch (getSuit()) {
		case 0:
			return "Spades";
		case 1:
			return "Hearts";
		case 2:
			return "Diamonds";
		case 3:
			return "Clubs";
		default:
			return "Not valid suit";
		}
	}

	// value to String method
	 public String convertValue(){
		 switch (getValue()) {
			case 1:
				return "Ace";
			case 2:
				return "Two";
			case 3:
				return "Three";
			case 4:
				return "Four";
			case 5:
				return "Five";
			case 6:
				return "Six";
			case 7:
				return "Seven";
			case 8:
				return "Eight";
			case 9:
				return "Nine";
			case 10:
				return "Ten";
			case 11:
				return "Jack";
			case 12:
				return "Queen";
			case 13:
				return "King";
			default:
				return "Not valid value";
			}
	 }
	
	//gets sets

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	//toString
	@Override
	public String toString() {
		return convertValue() + " of " + convertSuit();
	}
	
	
	

}
