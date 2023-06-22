package blackjackapplication;

import java.util.Scanner;
public class BlackjackGame extends Game {
    public BlackjackGame(String name) {
        super(name);
    }
    @Override
    public void declareWinner() {
        int highestValue = 0;
        BlackjackPlayer winner = null;

        // Find the player with the highest hand value without going over 21
        for (Player player : getPlayers()) {
            BlackjackPlayer blackjackPlayer = (BlackjackPlayer) player;
            int handValue = blackjackPlayer.getHandValue();
            if (handValue <= 21 && handValue > highestValue) {
                highestValue = handValue;
                winner = blackjackPlayer;
            }
        }

        // Declare the winner or a tie if no player has a valid hand
        if (winner != null) {
            System.out.println("The winner is: " + winner.getName());
        } else {
            System.out.println("It's a tie! No valid hand.");
        }
    }

    @Override
    public void play() {
        // Create a new BlackjackDeck
        BlackjackDeck deck = new BlackjackDeck(52);
        deck.shuffle();

        // Deal initial two cards to each player
        for (Player player : getPlayers()) {
            player.addToHand(deck.getCards().remove(deck.getCards().size() - 1));
            player.addToHand(deck.getCards().remove(deck.getCards().size() - 1));
        }

        // Players take turns to play
        for (Player player : getPlayers()) {
            if (player instanceof BlackjackPlayer) {
                BlackjackPlayer blackjackPlayer = (BlackjackPlayer) player;
                System.out.println(blackjackPlayer.getName() + ", it's your turn.");

                Scanner scanner = new Scanner(System.in);
                String choice;
                do {
                    System.out.println("Your current hand: " + blackjackPlayer.getHand());
                    System.out.println("Your hand value: " + blackjackPlayer.getHandValue());
                    System.out.println("Choose an action: (H)it or (S)tand");
                    choice = scanner.nextLine();

                    if (choice.equalsIgnoreCase("H")) {
                        // Player chooses to hit
                        blackjackPlayer.addToHand(deck.getCards().remove(deck.getCards().size() - 1));
                    }
                } while (!choice.equalsIgnoreCase("S") && !blackjackPlayer.isBust());
            }
        }
    }



}
