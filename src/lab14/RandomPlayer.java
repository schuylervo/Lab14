package lab14;

import java.util.Random;

public class RandomPlayer extends Player {

	private Random rand;
	
	@Override
	public Roshambo generateRoshambo() {
		Random rand = new Random();
		int n = rand.nextInt(3) + 1;
		if (n == 1) {
		return Roshambo.ROCK;
		}
		if (n == 2) {
		return Roshambo.PAPER;	
		}
		if (n ==3) {
		return Roshambo.SCISSORS;	
		}
		return generateRoshambo();
	}
	
	public RandomPlayer () {
		super();
	}
	
	public RandomPlayer (String name) { 
		super(name);
		
	}
	
}
