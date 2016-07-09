package Cards;

public class Cards {

	int sequence;

	Cards(int a) {
		sequence = a;
	}

	public String getsuit() {
		 
			if (sequence <= 12 && sequence >= 0)
				return "clubs";
			if (sequence <= 25 && sequence >= 13)
				return "Diamonds";
			if (sequence <= 38 && sequence >= 26)
				return "Hearts";
			else
				return "spades";
	}

	publuic int getSuitOrder() {
		return sequence / 13;
	}

	public int getPip() {
		return sequence % 13;
	}

	public int compare(Cards c) {
		return sequence - c.sequence; 
	}

	boolean equal(Cards card2) {
		if (this.getPip() == card2.getPip()) {
			if (this.getSuitOrder() == card2.getSuitOrder()) {
				return true;
			}
		}
		return false;
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
