package com.skilldistiller.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public  class Hand {
	private List<Card> handOfCards;

	
	
	// set up a hand
	public Hand() {
		handOfCards = new ArrayList<Card>();
		
	}
	//add cards from deck to hand
	public void  addCard(Deck deck) {
		handOfCards.add(deck.dealCard());
	}
	
	
	//calculate value
	public int calculateValue() {
		int value = 0;
		for (Card card : handOfCards) {
			value = card.getValue();
		}
		return value;
		
	}
	@Override
	public String toString() {
		return "Hand [handOfCards=" + handOfCards + "]";
	}
	
	
	
	//display value
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
