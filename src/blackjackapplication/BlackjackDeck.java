package blackjackapplication;

public class BlackjackDeck extends GroupOfCards {
    public BlackjackDeck(int size) {
        super(size);
        initializeDeck();
    }

    // Method to initialize the deck with blackjack cards
    private void initializeDeck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j <= 10; j++) {
                // Add numbered cards (2-10) for each suit
                getCards().add(new BlackjackCard(getSuit(i), Integer.toString(j)));
            }
            // Add special cards (Ace, King, Queen, Jack) for each suit
            getCards().add(new BlackjackCard(getSuit(i), "Ace"));
            getCards().add(new BlackjackCard(getSuit(i), "King"));
            getCards().add(new BlackjackCard(getSuit(i), "Queen"));
            getCards().add(new BlackjackCard(getSuit(i), "Jack"));
        }
    }

    // Method to get the suit name based on the index
    private String getSuit(int index) {
        switch (index) {
            case 0:
                return "Hearts";
            case 1:
                return "Diamonds";
            case 2:
                return "Clubs";
            case 3:
                return "Spades";
            default:
                return "";
        }
    }
}
