package blackjackapplication;

public class BlackjackPlayer extends Player {
    public BlackjackPlayer(String name) {
        super(name);
    }

    public int getHandValue() {
        int value = 0;
        int numAces = 0;

        // Calculate the value of the player's hand
        for (Card card : getHand()) {
            value += card.getValue();
            if (card.getRank().equals("Ace")) {
                numAces++;
            }
        }

        // Adjust the value if there are Aces in the hand
        // An Ace can have a value of 11 or 1, so we handle the case where the hand value exceeds 21
        while (value > 21 && numAces > 0) {
            value -= 10;
            numAces--;
        }

        return value;
    }

    public boolean isBust() {
        // Check if the player's hand value exceeds 21 (bust)
        return getHandValue() > 21;
    }

    @Override
    public void play() {
        // Logic to be implemented for the player's turn in Blackjack
    }
}
