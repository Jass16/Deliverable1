import java.util.ArrayList;

public abstract class Player {
    private String name;                 // Name of the player
    private ArrayList<Card> hand;        // ArrayList to store the player's hand of cards

    public Player(String name) {
        this.name = name;                // Initialize the player's name
        hand = new ArrayList<>();        // Initialize an empty hand ArrayList
    }

    public String getName() {
        return name;                     // Return the player's name
    }

    public void setName(String name) {
        this.name = name;                // Set the player's name
    }

    public ArrayList<Card> getHand() {
        return hand;                     // Return the player's hand ArrayList
    }

    public void addToHand(Card card) {
        hand.add(card);                  // Add a card to the player's hand ArrayList
    }

    public void resetHand() {
        hand.clear();                    // Remove all cards from the player's hand
    }

    public abstract void play();         // Abstract method to be implemented by subclasses
}
