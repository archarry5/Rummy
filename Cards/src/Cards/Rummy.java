package Cards;

import java.util.ArrayList;
import java.util.Random;

public class Rummy {
	ArrayList<Cards> cardSequence[] = new ArrayList<>();
	int joker;

	Rummy(int[] sequence) {
		for (int i = 0; i < sequence.length; i++) {
			cardSequence[i] = new Cards(sequence[i]);
		}
		joker = (int) Math.floor(Math.random() * 52);
	}

	boolean compareSet(Cards card1, Cards card2, Cards card3) {
	if((card1.getPip() == card2.getPip()) && (card2.getPip() == card3.getPip())) {
	                
		if (card1.getsuit() == card2.getsuit()) {
			return false;
		}
	        if (card2.getsuit() == card3.getsuit()) {
			return false;
		}
	        if (card1.getsuit() == card3.getsuit()) {
			return false;
		} 
	
		return true;

	  }
		return false;
		
	}
	
               void maintainSet() {

		for (int i = 0; i < 12; i++) {
			for (int j = i+1; j < 11; j++) {
				if (i != j) {
					if ((compareSet(cardSequence[i], cardSequence[j],
							cardSequence[j] + 1]) && cardsequence[i].getPip() {
						// System.out.println(cardSequence[i].sequence+ "+cardSequence[j].sequence+" "+cardSequence[j+1].sequence);
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
		seq = r.nextInt(52) ;
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
