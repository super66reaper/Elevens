public class Card {

	private String suit;
	private String rank;

	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue) {
		suit = cardSuit;
		rank = cardRank;
		pointValue = cardPointValue;
	}

	public String suit() {
		return this.suit;
    }

	public String rank() {
		return this.rank;
	}

	public int pointValue() {
		return this.pointValue;
	}

	public boolean matches(Card otherCard) {
		if((otherCard.suit().equal(suit)) && (otherCard.rank().equal(rank)) && otherCard.pointValue() == pointValue) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return rank + " of " + suit + " Point Value: " + pointValue;
	}
}
