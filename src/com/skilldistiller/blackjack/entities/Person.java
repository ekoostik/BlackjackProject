package com.skilldistiller.blackjack.entities;



public abstract class Person {
	private Hand hand = new Hand();
	private String name;

	public Person(String name, Hand hand) {
		this.name = name;
		this.hand = hand;

	}

	public Person() {

	}

	public void hitCard(Deck deck) {
		this.hand.addCard(deck);
		System.out.println("\nDealing a card to " + this.name+ "....\n");

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

	@Override
	public String toString() {
		return name + "'s Hand has a value of ("  + this.getHand().calculateValue()+ ")\n"+ hand;

}

	public abstract void play(Deck theDeck);{
		
	}
}
