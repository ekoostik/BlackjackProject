package com.skilldistiller.blackjack.entities;

public class Dealer implements PlayHand {

	private String name = "Dealer";
	private Hand hand;

	public Dealer() {

	}

	public Dealer(String name, Hand hand) {
		super();
		this.name = name;
		this.hand = hand;
	}

	public Hand getHand() {
		return hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	// plays hand
	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Dealer [name=" + name + ", hand=" + hand + "]";
	}
	

}
