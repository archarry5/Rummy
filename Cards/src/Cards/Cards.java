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

	
	public int getSuitOrder() {
		return sequence / 13;
	}

	public int compare(Cards c) {
		return sequence - c.sequence; 
	}

}
