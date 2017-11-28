package module2.lab13.lab4;

public class Card {
    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return "The Card: " + cardRank + "_" + cardSuit;
    }
}
