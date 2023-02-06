package com.skilldistiller.blackjack.app;

import com.skilldistiller.blackjack.entities.*;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp play = new BlackjackApp();
		play.launch();

	}

	public void launch() {

		System.out.println("Welcome to Blackjack !! \n");
		Deck theDeck = new Deck();
		Person pl1 = new Player();
		Person dealer = new Dealer();

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
		if (pl1.getHand().calculateValue() <= 21) {
			dealer.play(theDeck);
			int pl1Score = pl1.getHand().calculateValue();
			int dealerScore = dealer.getHand().calculateValue();

			if (pl1Score > dealerScore) {
				System.out.println("Player one wins with a score of " + pl1Score);
			} else if (pl1Score < dealerScore && dealerScore <21) {
				System.out.println("Dealer wins with a score of " + dealerScore);
			} else if (pl1Score == dealerScore){
				System.out.println("Game is a push. Player:" +pl1Score + ", Dealer" + dealerScore);

			}
		}

	}
}
