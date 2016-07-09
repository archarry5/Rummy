package Cards;

import java.util.ArrayList;
import java.util.Random;

public class Rummy {
	ArrayList<Cards> cardSequence = new ArrayList<>();
	ArrayList<Cards> sequences;
	ArrayList<Cards> triples;
	int joker;

	Rummy(int[] sequence) {
		sequences = new ArrayList<Cards>();
		triples = new ArrayList<Cards>();
		for (int i = 0; i < sequence.length; i++) {
			cardSequence.add(new Cards(sequence[i]));
		}
		joker = (int) (Math.random() * 52);
		Collections.sort(cardSequence)
	}

	boolean compareSet(Cards card1, Cards card2, Cards card3) {
		return (card1.getPip() == card2.getPip()) && (card2.getPip() == card3.getPip()) 
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
		return true;
	}

	public int numOfNaturalsequence() {
		int lifeCount = 0;
		boolean isInSeq = new boolean[cardSequence.length]; 
		int i = 0;	
		while (i < cardSequence.length - 2) {
			if (cardSequence.get(i + 2) - cardSequence.get(i) == 2) {
				lifeCount++;
				sequences.add(cardSequence.get(i)));
				sequences.add(cardSequence.get(i + 1)));	
				sequences.add(cardSequence.get(i + 2)));			
				i += 3;		
				if (i != cardSequence.length && (cardSequence.get(i) - cardSequence.get(i - 1))) {
					sequences.add(cardSequence.get(i)));				
					i++;	
				}
			} else {		
				i++;
			}
		return lifeCount;
	}
}
