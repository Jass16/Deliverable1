package blackjackapplication;
public abstract class Card {
    private String suit;    // Suit of the card (e.g., hearts, diamonds, clubs, spades)
    private String rank;    // Rank of the card (e.g., Ace, King, Queen, Jack, 2-10)

    public Card(String suit, String rank) {
        this.suit = suit;   // Initialize the suit of the card
        this.rank = rank;   // Initialize the rank of the card
    }

    public String getSuit() {
        return suit;        // Return the suit of the card
    }

    public String getRank() {
        return rank;        // Return the rank of the card
    }

    public abstract int getValue();   // Abstract method to be implemented by subclasses for retrieving the value of the card

    @Override
    public String toString() {
        return rank + " of " + suit;  // Return a string representation of the card (e.g., "Ace of Spades")
    }
}
