package lab14;

public abstract class Player {

		private String name; //fields
		
		//concrete classes must override/implement this methodS
		public abstract Roshambo generateRoshambo(); 
		
		public Player() { // no arg constructor
			
		}
		
		public Player(String name) { //overloaded constructor
			super();
			this.name = name;
		}

		public String getName() { //getter
			return name;
		}

		public void setName(String name) { //setter
			this.name = name;
		}

		@Override
		public String toString() { //toString
			return "Player [name=" + name + "]";
		}
		

		
		
	
}
