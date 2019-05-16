package cardgame;

import java.util.ArrayList;

import java.util.Scanner;

public class Game extends Deck {

	private static int score;
	private static Card currentCard;
	private static Card nextCard;
	private static Deck deck;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Deck d = new Deck();
		ArrayList<Card> cards = d.getCards();

		System.out.println(game(0, cards));
		// test1
		// System.out.println(cards.size());

		// test2
		// loop door cards heen en sysout van elke card de naam + suit + value
		// enhanced for loop

		// for (Card card : cards) {
		// System.out.println(card);

		// }

	}

	public static String game(int points, ArrayList<Card> cards) {
		boolean isCorrect;
		Card currentCard = cards.iterator().next();
		cards.remove(currentCard);
		System.out.println(currentCard);
		Card nextCard = cards.iterator().next();
		if(currentCard.value == nextCard.value){
			cards.remove(nextCard);
			return game(points, cards);
		}
		
		

		System.out.println("");
		System.out.println("is the next card going to be higher or lower?");
		String response = scan.nextLine();
		isCorrect = check(response, currentCard, nextCard);
		if(isCorrect == true){
			System.out.println("");
			System.out.println(nextCard);
			System.out.println("correct");
			points++;
			return game(points, cards);
		}
		else 
			System.out.println("");
		System.out.println("wrong");
		System.out.println(nextCard);
		System.out.println("you had " + points+ " points");
		

		return "game over";
	}

	public static boolean check(String response, Card card1, Card card2) {
		if (response.equals("higher")) {
			if (card1.value < card2.value) {
				System.out.println("correct");
				return true;
			}
		}

		else if (response.equals("lower")) {
			if (card1.value > card2.value) {

				System.out.println("correct");
				return true;
			}
		} else
			System.out.println("incorrect");
		return false;

	}

}
