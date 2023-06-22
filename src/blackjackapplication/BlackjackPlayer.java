/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackapplication;

/**
 *
 * @author jassk
 */
public class BlackjackPlayer extends Player {
    public BlackjackPlayer(String name) {
        super(name);
    }

    public int getHandValue() {
        int value = 0;
        int numAces = 0;

        for (Card card : getHand()) {
            value += card.getValue();
            if (card.getRank().equals("Ace")) {
                numAces++;
            }
        }

        while (value > 21 && numAces > 0) {
            value -= 10;
            numAces--;
        }

        return value;
    }

    public boolean isBust() {
        return getHandValue() > 21;
    }

    @Override
    public void play() {
        // Logic to be implemented for the player's turn in Blackjack
    }
}
