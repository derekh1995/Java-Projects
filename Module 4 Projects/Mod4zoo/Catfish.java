// Derek Holbrook
// Assignment 17

package Module4.Mod4zoo;

public class Catfish implements Animal {
  
  	@SuppressWarnings("unused")
	private double lengthInInches;
  
  	public Catfish(double lengthInInches) {
    	this.lengthInInches = lengthInInches;
    }
  
  	private String sound = "blub";
  	
    @Override
  	public String getSound() {
    	return sound;
    }
}
