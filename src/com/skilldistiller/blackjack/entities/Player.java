package com.skilldistiller.blackjack.entities;

import java.util.Scanner;

public class Player extends Person {
	Scanner sc = new Scanner(System.in);

	public Player() {
	;

	}

// plays hand

	public void play(Deck deck) {

		System.out.println("Would you like to Hit or Stand?\n" + "1 for Hit\n" + "2 for Stand.");

		while (!sc.hasNextInt()) {
			System.out.println("Please enter a number for the menu option");
			sc.next();
		}
		int userIn = sc.nextInt();
// if hit  else stay
		if (userIn ==1) {
			this.hitCard(deck);
			System.out.println(this.toString());
			if (this.getHand().calculateValue()>21) {
				System.out.println( this.getName()+ "  Bust! \nGame Over");
				return;
	}
			else {
				this.play(deck);
				}
		}
		else if(userIn==2){
			System.out.println("Player 1 is Staying\n");
		}
		else {  
			System.out.println("Please enter 1 or 2");
			this.play(deck);
		}
		sc.close();
	}

}
