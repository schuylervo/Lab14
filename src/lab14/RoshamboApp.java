package lab14;
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int starkWins = 0;
		int lannisterWins = 0;
		int userNameWins = 0;
		String playAgain = "y";
		String playAgain2 = "y";
		
		System.out.println("Welcome to Rock, Paper, Scissors, Game of Thrones edition!");
		
		String userName = Validator.getString(scnr, "Please enter your name: ");
		
		Player human = new ConsolePlayer(scnr, userName);
		
		System.out.println("Hi, " + userName + ".");
				
		do { 
			String opponentChoice = Validator.getString(scnr, "Would you like to play a game against the Lannisters or the Starks? Winner takes the Iron Throne!");
			opponentChoice = opponentChoice.toLowerCase();
		
		do {
			if (!opponentChoice.startsWith("l") && (!opponentChoice.startsWith("s"))) {
				System.out.println("Invalid entry. Please enter Lannisters or Starks.");
			}
			
			if (opponentChoice.startsWith("l")) {
				// Create the player
				Player lannisterOpponent = new RockPlayer("Tyrion Lannister");
							
				
				// Get the player's choice
				Roshambo lannisterChoice = lannisterOpponent.generateRoshambo();
				
				// Get the user's choice
				Roshambo humanChoice = human.generateRoshambo();
					
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
					} 
			
				//	playAgain = Validator.getString(scnr, "Would you like to play again? y/n"); 
				//}while (playAgain.equalsIgnoreCase("y")); 
			}
		
			if (opponentChoice.startsWith("s")) {
				
				// Create the player
				Player starkOpponent = new RandomPlayer("Ned Stark");
			
			//do {
				
				// Get the user's choice
				Roshambo humanChoice = human.generateRoshambo();
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
				
			}	
			playAgain = Validator.getString(scnr, "Would you like to play the game (of thrones) again? y/n"); 
			
		//}while (!(opponentChoice.startsWith("s")) && !(opponentChoice.startsWith("l"))); 
		
	} while (playAgain.equalsIgnoreCase("y"));
		playAgain2 = Validator.getString(scnr, "Would you like to test your wits against another opponent? y/n"); 
	} while (playAgain2.equalsIgnoreCase("y"));

		System.out.println("Thank you for playing. You are now banished to the Wall. Goodbye.");
	} 
}
