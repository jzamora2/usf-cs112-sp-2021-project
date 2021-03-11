package abstraction;

public abstract class Pokemon {
  // Can only be accessed by the inherited class
  protected String name;
  protected String color;
  protected boolean hasTrainer;
  protected boolean hasAbility;
  

  // Constructor
  public Pokemon(String nParam, String cParam) {
    this.name = nParam;
    this.color = cParam;
    this.hasTrainer = false;
  }

  public Pokemon(String nParam, String cParam, boolean hParam) {
	  this.name = nParam;
	  this.color = cParam;
	  this.hasTrainer = hParam;
  }
  
  public void gunkAbility() {
	  this.hasAbility = true;
  }
  
  public void cannonAbility() {
	  this.hasAbility = true;
  }
  
  final public boolean abilityCheck() {
	  return this.hasAbility;
  }
  
  // Default constructor
  public Pokemon() {
	  this.name = "";
	  this.color = "";
	  this.hasTrainer = false;
  }
  
  // Accessor
  public String getName() {
    return this.name;
  }
  
  public String getColor() {
	  return this.color;
  }
  
  public boolean hasTrainer() {
	  return this.hasTrainer;
  }
  
  // Mutator
  public void setName(String nParam) {
    this.name = nParam;
  }
  
  public void setColor(String cParam) {
	  this.color = cParam;
  }
  
  public void setHasTrainer(boolean hParam) {
	  this.hasTrainer = hParam;
  }
   
  //Abstract Methods
  public abstract void exitPokeball();
  public abstract void enterPokeball();

  // Method
  public String toString() {
    return "Pokemon Name: " + this.name + " | Color: " + this.color + " | Has Trainer? (T/F): " + this.hasTrainer();
  }
  
}

