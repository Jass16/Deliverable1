import java.util.ArrayList;
import java.util.Collections;

public abstract class GroupOfCards {
    private ArrayList<Card> cards;  // ArrayList to store the cards in the group
    private int size;               // Size of the group of cards

    public GroupOfCards(int size) {
        this.size = size;           // Initialize the size of the group
        cards = new ArrayList<>();  // Initialize an empty ArrayList for cards
    }

    public ArrayList<Card> getCards() {
        return cards;               // Return the ArrayList of cards
    }

    public void shuffle() {
        Collections.shuffle(cards); // Shuffle the cards in the group using the Collections.shuffle() method
    }

    public int getSize() {
        return size;                // Return the size of the group
    }

    public void setSize(int size) {
        this.size = size;           // Set the size of the group
    }
}
