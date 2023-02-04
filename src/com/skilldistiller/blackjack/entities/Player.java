package com.skilldistiller.blackjack.entities;

public class Player implements PlayHand {

	private String name;
	private Hand hand;

	public Player() {

	}

	public Player(String name, Hand hand) {
		super();
		this.name = name;
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hand getHand() {
		return hand;
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
		return "Player [name=" + name + ", hand=" + hand + "]";
	}
	
	

}
