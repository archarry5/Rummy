package Cards;

public class Cards {

	int sequence;

	Cards(int a) {
		sequence = a;
	}

	String getsuit() {
		String[] suits = {"Clubs", "Hearts", "Diamonds", "Spades"};
		return suits[sequence / 13];			
	}
	public int getPip() {
		return sequence % 13;
	}

	
	publuic int getSuitOrder() {
		return sequence / 13;
	}

	public int compare(Cards c) {
		return sequence - c.sequence; 
	}

	public boolean equals(Cards ca) {
		return ((getPip() == c.getPip()) && (getSuitOrder() == c.getSuitOrder()));
	}
}
