package Cards;

import java.util.ArrayList;
import java.util.Random;

public class Rummy {
	Cards cardSequence[] = new Cards[13];
	int joker;

	Rummy(int[] sequence) {
		for (int i = 0; i < sequence.length; i++) {
			cardSequence[i] = new Cards(sequence[i]);
		}
		joker = (int) Math.floor(Math.random() * 52);
	}

	boolean compareSet(Cards card1, Cards card2, Cards card3) {
		if (card1.isSameSuit(card2)) {
			return false;
		}
		if (card2.isSameSuit(card3)) {
			return false;
		}
		if (card3.isSameSuit(card1)) {
			return false;
		}
		return true;
	}

	void maintainSet() {

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 11; j++) {
				if (i != j) {
					if (compareSet(cardSequence[i], cardSequence[j],
							cardSequence[j + 1])) {
						// System.out.println(cardSequence[i].sequence+" "+cardSequence[j].sequence+" "+cardSequence[j+1].sequence);
						System.out.println("got triple");
						return;
					}
				}
			}
		}
	}

	Cards generaterandomjoker() {
		int seq;
		Random r = new Random();
		seq = r.nextInt(51 - 0 + 1) + 0;
		Cards joker = new Cards(seq);
		return joker;
	}

	boolean issequencewithjoker(ArrayList<Cards> ar, Cards joker) {
		/*
		 * boolean ret = true;
		 */
		return true;
	}

	boolean isNaturalsequence(ArrayList<Cards> ar) {

		for (int i = 0; i < ) {
			currentCard c = ar.get(i);
			for (int j = 0; j < ar.size(); j++) {
				if (Math.abs(c.sequence - ar.get(i).sequence) ==  1) {
					count++;
					currentCard
				}
			} 
		}

	}

}
