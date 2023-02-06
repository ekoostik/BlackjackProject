package com.skilldistiller.blackjack.entities;

public class Dealer extends Person {

	
	public Dealer() {
	

	}

// plays hand

	public void play(Deck deck) {
		while (this.getHand().calculateValue()<17) {
			this.hitCard(deck);
//			System.out.println(this.toString());
			if (this.getHand().calculateValue()>21) {
				System.out.println( this.toString()+ "\nDealer Bust! \nGame Over");
				return;
		}
		
	}
		System.out.println( this.toString()+ "\n Dealer Stands.\n");
	}

	

	
	


}
