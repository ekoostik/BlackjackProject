package com.skilldistiller.blackjack.testing;

import com.skilldistiller.blackjack.entities.Deck;

public class DealingCards {

	public static void main(String[] args) {
		
		DealingCards dealer = new DealingCards();
		dealer.deal();

	}

	private void deal() {
		Deck theDeck = new Deck();
		theDeck.shuffleDeck();
		System.out.println(theDeck.getDeck().size());
	}

}
