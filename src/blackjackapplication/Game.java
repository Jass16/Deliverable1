package blackjackapplication;

import java.util.ArrayList;

public abstract class Game {
    private String name;                 // Name of the game
    private ArrayList<Player> players;   // ArrayList to store the players in the game

    public Game(String name) {
        this.name = name;                // Initialize the game's name
        players = new ArrayList<>();     // Initialize an empty ArrayList for players
    }

    public String getName() {
        return name;                     // Return the game's name
    }

    public ArrayList<Player> getPlayers() {
        return players;                  // Return the ArrayList of players
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;          // Set the ArrayList of players
    }

    public abstract void play();         // Abstract method to be implemented by subclasses for playing the game

    public abstract void declareWinner(); // Abstract method to be implemented by subclasses for declaring the winner
}
