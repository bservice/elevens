package com.company;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {

		Card card1 = new Card("Jack", "Hearts", 11);
		Card card2 = new Card("Four", "Clubs", 4);
		Card card3 = new Card("Ten", "Spades", 10);

		System.out.println("card1 suit: " + card1.suit());
		System.out.println("card1 rank: " + card1.rank());
		System.out.println("card1 point value: " + card1.pointValue());

		System.out.println("card2 suit: " + card2.suit());
		System.out.println("card2 rank: " + card2.rank());
		System.out.println("card2 point value: " + card2.pointValue());

		System.out.println("card3 suit: " + card3.suit());
		System.out.println("card3 rank: " + card3.rank());
		System.out.println("card3 point value: " + card3.pointValue());
	}
}
