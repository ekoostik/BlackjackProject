package com.skilldistiller.blackjack.app;

import com.skilldistiller.blackjack.entities.Deck;
import com.skilldistiller.blackjack.entities.Hand;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp play = new BlackjackApp();
		play.launch();
		

	}
	
	public void launch() {
		
		System.out.println("Welcome to Blackjack !! ");
		Deck theDeck = new Deck();
		Hand hand = new Hand();
		theDeck.shuffleDeck();
		hand.addCard(theDeck);
		System.out.println(hand.calculateValue());
	
		
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// game logic// who won//
	
	
	
	
	
	
	
	
	
	
	
	
}
