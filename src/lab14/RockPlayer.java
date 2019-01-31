package lab14;

public class RockPlayer extends Player {

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}
	
	public RockPlayer () {
		super();
	}
	
	public RockPlayer(String name) { 
		super(name);
		
	}
	

}
