package com.skilldistiller.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> deck = new ArrayList<>(52);

	public Deck() {
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();
		for (Suit suit : suits) {
			for (Rank rank : ranks) {
				Card card = new Card(suit, rank);
				deck.add(card);

			}

		}

	}

	public int checkSize() {

		return deck.size();
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}

	public List<Card> getDeck() {
		return deck;

	}

	public Card dealCard() {
		return deck.remove(0);
	}

	public void shuffleDeck() {
		Collections.shuffle(deck);
//		System.out.println(deck.toString());
	}

	@Override
	public String toString() {
		return  deck + " ";
	}


	
	

}