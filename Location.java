package game;

import java.util.*;//Import everything from java.util. Everything is represented by *.
public class Location{
	private ArrayList<Location> locations = new ArrayList();
  
  public void addLocation(Location l){
	  locations.add(l);
  }
  
  
	public Location() {//This is the constructor that runs when a new instance of the Spellbook class is created.
		
		
		
	}
  
  
  public ArrayList<Location> getLocations(){//It's a behaviour that returns all the spells in the spell book.
  	return locations;
  }
}

