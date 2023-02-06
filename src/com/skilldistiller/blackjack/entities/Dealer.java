package com.skilldistiller.blackjack.entities;

public class Dealer extends Person {

	
	public Dealer() {
		super.setName("Dealer");

	}

// plays hand

	public void play(Deck deck) {
		while (this.getHand().calculateValue()<17) {
			this.hitCard(deck);
			System.out.println(this.toString() + this.getHand().calculateValue());
			if (this.getHand().calculateValue()>21) {
				System.out.println( this.getName()+ " has bust! \nGame Over");
				return;
		}
		
	}
		System.out.println("Dealer stands");
	}

	

	
	


}
