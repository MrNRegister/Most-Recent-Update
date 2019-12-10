package game;

import java.util.*;//Import everything from java.util. Everything is represented by *.
public class Creature{
	private ArrayList<Creature> creatures = new ArrayList();
  
  public void addCreature(Creature cre){
	 creatures.add(cre);
  }
  
  
	public Creature() {//This is the constructor that runs when a new instance of the Spellbook class is created.
		
		
		
	}
  
  
  public ArrayList<Creature> viewCreatures(){//It's a behaviour that returns all the spells in the spell book.
  	return creatures;
  }
}

