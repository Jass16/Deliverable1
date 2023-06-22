package blackjackapplication;

public class BlackjackCard extends Card {
    public BlackjackCard(String suit, String rank) {
        super(suit, rank);
    }

    @Override
    public int getValue() {
        String rank = getRank();
        if (rank.equals("Ace")) {
            return 11;
        } else if (rank.equals("King") || rank.equals("Queen") || rank.equals("Jack")) {
            return 10;
        } else {
            return Integer.parseInt(rank);
        }
    }
}