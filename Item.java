package game;

import java.util.*;//Import everything from java.util. Everything is represented by *.
public class Item{
	private ArrayList<Item> items = new ArrayList();
  
  public void addItem(Item it){
	 items.add(it);
  }
  
  
	public Item() {//This is the constructor that runs when a new instance of the Spellbook class is created.
		
		
		
	}
  
  
  public ArrayList<Item> viewItems(){//It's a behaviour that returns all the spells in the spell book.
  	return items;
  }
}

