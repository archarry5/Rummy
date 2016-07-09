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

	public boolean equals(Cards card2) {
		return ((getPip() == c.getPip()) && (getSuitOrder() == c.getSuitOrder()));
	}

	boolean isAdjacent(Cards card) {
		if (this.sequence / 13 != card.sequence / 13){
			return false;
		}
		if (this.sequence == card.sequence - 1){
			return true;
		}
		if (this.sequence == card.sequence + 1){
			return true;
		}
		return false;
	}

	boolean isSameSuit(Cards card) {
		 
		if (this.sequence / 13 == card.sequence / 13){
			return true;
		}
		if (this.getPip() == card.getPip()){
			System.out.println(this.sequence+" "+card.sequence);
			return false;
		}
		
		return true;
	}
}
