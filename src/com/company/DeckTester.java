package com.company;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
     /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank1 = {"Two", "Ace", "Ten"};
		String[] suit1 = {"Clubs", "Spades", "Diamonds"};
		int[] value1 = {2, 1, 10};
		Deck deck1 = new Deck(rank1, suit1, value1);

		String[] rank2 = {"Five", "Queen", "Jack"};
		String[] suit2 = {"Hearts", "Clubs", "Spades"};
		int[] value2 = {5, 12, 11};
		Deck deck2 = new Deck(rank2, suit2, value2);

		String[] rank3 = {"Three", "Four", "King"};
		String[] suit3 = {"Clubs", "Diamonds", "Hearts"};
		int[] value3 = {3, 4, 13};
		Deck deck3 = new Deck(rank3, suit3, value3);

		System.out.println("Is deck1 empty? " + deck1.isEmpty());
		System.out.println("What is the size of deck2? " + deck2.size());
		System.out.println("Dealing a card from deack3... " + deck3.deal());

	}
}

