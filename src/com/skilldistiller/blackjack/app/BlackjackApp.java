package com.skilldistiller.blackjack.app;

import com.skilldistiller.blackjack.entities.*;


public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp play = new BlackjackApp();
		play.launch();
		

	}
	
	public void launch() {
		
		System.out.println("Welcome to Blackjack !! ");
		Deck theDeck = new Deck();
		Player pl1 = new Player();
		Dealer dealer = new Dealer();
		
		
		theDeck.shuffleDeck();
		
		System.out.println(dealer.toString());
	
		
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// game logic// who won//
	
	
	
	
	
	
	
	
	
	
	
	
}
