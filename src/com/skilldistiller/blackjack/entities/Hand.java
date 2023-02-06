package com.skilldistiller.blackjack.entities;

import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> handOfCards;

	// set up a hand
	public Hand() {
		handOfCards = new ArrayList<Card>();

	}

	// add cards from deck to hand
	public void addCard(Deck deck) {
		handOfCards.add(deck.dealCard());
	}

	// calculate value
	public int calculateValue() {
		int value = 0;
		for (Card card : handOfCards) {
			value = value + card.getValue();
		}
		return value;

	}

	@Override
	public String toString() {
		return handOfCards + "";
	}

}
