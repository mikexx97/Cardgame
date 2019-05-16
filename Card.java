package cardgame;

public class Card {
	String suit;
	String name;
	int value;

	public Card(String suit, String name, int value) {
		this.value = value;
		this.name = name;
		this.suit = suit;
	}

	public String toString() {
		return name + " of " + suit;

	}

}
