//*made by Jenica*//

package PokemonInheritance;

interface Pokemon {
	public String name;
	public String color;
	public boolean hasTrainer;
	public boolean canMove;
	
	//Constructor
	Pokemon(String nParam, String cParam) {
		this.name = nParam;
		this.color = cParam;
		this.hasTrainer = false;
	}
	
	public Pokemon(String nParam, String cParam, boolean hParam) {
		this.name = nParam;
		this.color = cParam;
		this.hasTrainer = hParam;
	}

	void squirtleMove() {
		  this.canMove = true;
	  }
	  
	 void pikachuMove() {
		  this.canMove = true;
	  }
	//Default Constructor
	public Pokemon() {
		this.name = "";
		this.color = "";
		this.hasTrainer = false;
	}
	
	//Accessor
	public String getName() {
		return this.name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public boolean hasTrainer() {
		return this.hasTrainer();
	}
	
	//Mutator
	public void setName(String nParam) {
		this.name = nParam;
	}
	
	public void setColor(String cParam) {
		this.color = cParam;
	}
	
	public void setHasTrainer(boolean hParam) {
		this.hasTrainer = hParam;
	}
		
	//Method
	public String toString() {
		return "I am a Pokemon: " + this.name + "Color: " + this.color + "Trainer: " + this.hasTrainer;
	}
	
	//Abstract Methods
	public abstract void speak();
	public abstract void trainerName();

	public void move() {
		// TODO Auto-generated method stub
		
	}

		
}
		
