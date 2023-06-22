package blackjackapplication;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of the BlackjackGame
        BlackjackGame blackjackGame = new BlackjackGame("Blackjack");
        
        // Create a Scanner object to read user input
        Scanner sc= new Scanner(System.in);
        
        // Prompt and read the name of Player 1
        System.out.println("Player 1 - Enter your name");
        String name1 = sc.nextLine();
        
        // Prompt and read the name of Player 2
        System.out.println("Player 2 - Enter your name");
        String name2 = sc.nextLine();
        
        // Create BlackjackPlayer objects for each player with their respective names
        BlackjackPlayer player1 = new BlackjackPlayer(name1);
        BlackjackPlayer player2 = new BlackjackPlayer(name2);
        
        // Add the players to the BlackjackGame
        blackjackGame.getPlayers().add(player1);
        blackjackGame.getPlayers().add(player2);
        
        // Start the game
        blackjackGame.play();
        
        // Declare the winner
        blackjackGame.declareWinner();
    }
}

