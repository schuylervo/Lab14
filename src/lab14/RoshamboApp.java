package lab14;
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int starkWins = 0;
		int lannisterWins = 0;
		int userNameWins = 0;
		String playAgain = "y";
		
		System.out.println("Welcome to Rock, Paper, Scissors!");
		
		String userName = Validator.getString(scnr, "Please enter your name: ");
		
		Player human = new ConsolePlayer(scnr, userName);
		
		
		String opponentChoice = Validator.getString(scnr, "Would you like to play a game against the Lannisters or the Starks?");
		
		Roshambo humanChoice = human.generateRoshambo();
		
		do {
			
		if (opponentChoice.equalsIgnoreCase("l")) {
			// Create the player
			Player lannisterOpponent = new RockPlayer("Tyrion Lannister");
			
			
		do {
			// Get the player's choice
			Roshambo lannisterChoice = lannisterOpponent.generateRoshambo();
			// Get the user's choice
			humanChoice = human.generateRoshambo();
			if ((humanChoice == Roshambo.ROCK) && (lannisterChoice == Roshambo.ROCK)) {
				System.out.println(human.getName() +": Rock");
				System.out.println(lannisterOpponent.getName() +": Rock");
				System.out.println("Draw!");	
				System.out.println(human.getName() + ": " + userNameWins);
				System.out.println(lannisterOpponent.getName() + ": " + lannisterWins);
			}
			if ((humanChoice == Roshambo.PAPER) && (lannisterChoice == Roshambo.ROCK)) {
				System.out.println(human.getName() +": Paper");
				System.out.println(lannisterOpponent.getName() +": Rock");
				System.out.println(human.getName() + " wins!");
				userNameWins = userNameWins + 1;
				System.out.println(human.getName() + ": " + userNameWins);
				System.out.println(lannisterOpponent.getName() + ": " + lannisterWins);
			}
			if ((humanChoice == Roshambo.SCISSORS) && (lannisterChoice == Roshambo.ROCK)) {
				System.out.println(human.getName() +": Scissors");
				System.out.println(lannisterOpponent.getName() +": Rock");
				System.out.println(lannisterOpponent.getName() + " wins!");	
				lannisterWins = lannisterWins + 1;
				System.out.println(human.getName() + ": " + userNameWins);
				System.out.println(lannisterOpponent.getName() + ": " + lannisterWins);
			} else {
				
			}
			playAgain = Validator.getString(scnr, "Would you like to play again? y/n"); 
		}while (playAgain.equalsIgnoreCase("y")); 
		}
		
		if (opponentChoice.equalsIgnoreCase("s")) {
			humanChoice = human.generateRoshambo();
			// Create the player
			Player starkOpponent = new RandomPlayer("Ned Stark");
			
			do {
			// Get the player's choice
			Roshambo starkChoice = starkOpponent.generateRoshambo();
			
			if ((humanChoice == Roshambo.ROCK) && (starkChoice == Roshambo.SCISSORS)) {
				System.out.println(human.getName() +": Rock");
				System.out.println(starkOpponent.getName() +": Scissors");
				System.out.println(human.getName() + " wins!");
				userNameWins++;
				System.out.println(human.getName() + ": " + userNameWins);
				System.out.println(starkOpponent.getName() + ": " + starkWins);
			}
			if ((humanChoice == Roshambo.ROCK) && (starkChoice == Roshambo.PAPER)) {
				System.out.println(human.getName() +": Rock");
				System.out.println(starkOpponent.getName() +": Paper");
				System.out.println(starkOpponent.getName() + " wins!");
				starkWins++;
				System.out.println(human.getName() + ": " + userNameWins);
				System.out.println(starkOpponent.getName() + ": " + starkWins);
				
			}
			if ((humanChoice == Roshambo.ROCK) && (starkChoice == Roshambo.ROCK)) {
				System.out.println(human.getName() +": Rock");
				System.out.println(starkOpponent.getName() +": Rock");
				System.out.println("Draw!");
				System.out.println(human.getName() + ": " + userNameWins);
				System.out.println(starkOpponent.getName() + ": " + starkWins);
			}
			if ((humanChoice == Roshambo.PAPER) && (starkChoice == Roshambo.ROCK)) {
				System.out.println(human.getName() +": Paper");
				System.out.println(starkOpponent.getName() +": Rock");
				System.out.println(human.getName() + " wins!");
				userNameWins++;
				System.out.println(human.getName() + ": " + userNameWins);
				System.out.println(starkOpponent.getName() + ": " + starkWins);
			}
			if ((humanChoice == Roshambo.PAPER) && (starkChoice == Roshambo.PAPER)) {
				System.out.println(human.getName() +": Paper");
				System.out.println(starkOpponent.getName() +": Paper");
				System.out.println("Draw!");
				System.out.println(human.getName() + ": " +  userNameWins);
				System.out.println(starkOpponent.getName() + ": " + starkWins);
			}	
			if ((humanChoice == Roshambo.PAPER) && (starkChoice == Roshambo.SCISSORS)) {
				System.out.println(human.getName() +": Paper");
				System.out.println(starkOpponent.getName() +": Scissors");
				System.out.println(starkOpponent.getName() + " wins!");	
				starkWins++;
				System.out.println(human.getName() + ": " + userNameWins);
				System.out.println(starkOpponent.getName() + ": " + starkWins);
				
			}	
			if ((humanChoice == Roshambo.SCISSORS) && (starkChoice == Roshambo.ROCK)) {
				System.out.println(human.getName() +": Scissors");
				System.out.println(starkOpponent.getName() +": Rock");
				System.out.println(starkOpponent.getName() + " wins!");
				starkWins++;
				System.out.println(human.getName() + ": " + userNameWins);
				System.out.println(starkOpponent.getName() + ": " + starkWins);
			}	
			if ((humanChoice == Roshambo.SCISSORS) && (starkChoice == Roshambo.PAPER)) {
				System.out.println(human.getName() +": Scissors");
				System.out.println(starkOpponent.getName() +": Paper");
				System.out.println(human.getName() + " wins!");	
				userNameWins++;
				System.out.println(human.getName() + ": " +  userNameWins);
				System.out.println(starkOpponent.getName() + ": " + starkWins);
			}
		
			if ((humanChoice == Roshambo.SCISSORS) && (starkChoice == Roshambo.SCISSORS)) {
				System.out.println(human.getName() +": Scissors");
				System.out.println(starkOpponent.getName() +": Scissors");
				System.out.println("Draw!");	
				System.out.println(human.getName() + ": " + userNameWins);
				System.out.println(starkOpponent.getName() + ": " + starkWins);
			}
			else {
				
			}
			playAgain = Validator.getString(scnr, "Would you like to play again? y/n"); 
		}	while (playAgain.equalsIgnoreCase("y"));
		}
		else {
			System.out.println("You made an invalid selection. Please try again.");
		}
		}while (!(opponentChoice.equalsIgnoreCase("s")) && !(opponentChoice.equalsIgnoreCase("l"))); 
		
		
		
		
		
		
		 
			
	
		
		
		System.out.println("Thanks for playing! Goodbye.");

	}

}
