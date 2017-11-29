package module2.lab13.lab4;

public class Main {
    public static void main(String[] args) {
        Card[] cards = new Card[52];
        int index = 0;

        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards[index] = new Card(suit, rank);
                index++;
            }
        }
        for (Card card : cards){
            System.out.println(card.toString());
        }
    }
}
