package homework;

import java.util.Scanner;

public class BlackJackGame {
	Scanner keyboard = new Scanner(System.in);
	private Deck d; 
	private Hand player1; 
	private Hand dealer; 
	private String response = "Stay";
	private int playerBank;
	private int wager;
	private int pot;
	

	public void gameLogic() {
		d = new Deck();
		player1 = new Hand();
		dealer = new Hand();
		
		System.out.println("Let's play Blackjack!  I'll shuffle and deal:");
		System.out.println("");
		d.shuffleDeck();

		player1.addCard(d.dealCard());
		player1.addCard(d.dealCard());
		System.out.println("You have: ");
		player1.cardsInHand();
		System.out.println("");

		dealer.addCard(d.dealCard());
		dealer.addCard(d.dealCard());
		System.out.println("Dealer has: ");
		dealer.showLastCard();

		System.out.println("");
		do {
			System.out.println("Do you want to STAY or HIT?");
			response = keyboard.next();

			// method for stay or hit?
			if (response.charAt(0) == 'h' || response.charAt(0) == 'H') {
				System.out.println("Your next card is:");
				player1.addCard(d.dealCard());
				player1.showLastCard();

				if (player1.getValueOfHand() > 21) {
					System.out.println("You Busted - Dealer wins!");
					break;
				}
			}

		} while (response.charAt(0) == 'h' || response.charAt(0) == 'H');

		if (response.charAt(0) == 's' || response.charAt(0) == 'S') {
			while (dealer.getValueOfHand() < 16) {
				dealer.addCard(d.dealCard());
			}
			if (player1.getValueOfHand() > dealer.getValueOfHand()) {
				System.out.println("You win!!!  Your hand: ");
				player1.cardsInHand();
				System.out.println("Beats the dealer's hand: ");
				dealer.cardsInHand();
			} else if (dealer.getValueOfHand() > player1.getValueOfHand()) {
				System.out.println("Dealer wins!!!  Dealer's hand: ");
				dealer.cardsInHand();
				System.out.println("Beats the your hand: ");
				player1.cardsInHand();
			} else {
				System.out.println("21 by both - Dealer wins!");
			}
		}
	}
	
	public void placeBetLogic(){
		System.out.println("How much do you want to wager?");
		wager = keyboard.nextInt();
		pot = wager + wager;
	}
	
	public void bettingLogic(){
		if (dealer.getValueOfHand() > player1.getValueOfHand()){
			pot = 0;
			}
		else if (player1.getValueOfHand() > dealer.getValueOfHand()) {
			playerBank = pot;
			System.out.println("You win the pot: " + pot);
		}
		else {
			
		}
		}

	public static void main(String[] args) {
		BlackJackGame bjg = new BlackJackGame();
		bjg.placeBetLogic();
		bjg.gameLogic();
		
	}
}
