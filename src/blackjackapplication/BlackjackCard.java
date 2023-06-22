package blackjackapplication;

public class BlackjackCard extends Card {
    public BlackjackCard(String suit, String rank) {
        super(suit, rank);
    }

    @Override
    public int getValue() {
        String rank = getRank();
        if (rank.equals("Ace")) {
            // Ace has a value of 11 in Blackjack
            return 11;
        } else if (rank.equals("King") || rank.equals("Queen") || rank.equals("Jack")) {
            // King, Queen, and Jack have a value of 10 in Blackjack
            return 10;
        } else {
            // For numbered cards (2-10), the value is equal to the rank
            return Integer.parseInt(rank);
        }
    }
}