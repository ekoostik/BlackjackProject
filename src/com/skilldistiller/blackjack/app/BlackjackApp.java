package com.skilldistiller.blackjack.app;

import java.util.Scanner;

import com.skilldistiller.blackjack.entities.*;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp play = new BlackjackApp();
		play.launch();

	}

	public void launch() {

		System.out.println("Welcome to Blackjack !! \n");
		Deck theDeck = new Deck();
		Player pl1 = new Player();
		Dealer dealer = new Dealer();

		theDeck.shuffleDeck();

		if (theDeck.checkSize() != 0) {
			dealer.getHand().addCard(theDeck);
			System.out.println(dealer.toString() + "[Facedown Card]\n");

			dealer.getHand().addCard(theDeck);

			pl1.getHand().addCard(theDeck);
			pl1.getHand().addCard(theDeck);
			System.out.println(pl1.toString() + "\n" + "Value" + " " + pl1.getHand().calculateValue());
		}
		
		
		pl1.play(theDeck);

		

	
	}
	
	public void round() {
		
	}
}
