package game;//The package is called game. This class is a part of this package.
import java.util.*;//We are importing everything from java.util. * = everything.

public class Start{
	public static void main (String[] args){//This tells Java where the program starts.
  	Fireball fb = new Fireball();//Make the class "Fireball" also be known as "fb".
    Repair r = new Repair();//Make the class "Repair" also be known as "r".
    Heal h = new Heal();//Make the class "Heal" also be known as "h".
    Spellbook sb = new Spellbook();//Make the class "Spellbook" also be known as "sb".
    Item it = new Item();//Make the class "Item" also be known as "it".
    Bow b = new Bow();//Make the class "Bow" also be known as "b".
    Axe ax = new Axe();//Make the class "Axe" also be known as "ax".
    Sword sw = new Sword();//Make the class "Sword" also be known as "sw".
    Creature cre = new Creature();//Make the class "Creature" also be known as "cre".
    Dragon d = new Dragon();//Make the class "Dragon" also be known as "d".
    Orc o = new Orc();//Make the class "Orc" also be known as "o".
    Human hu = new Human();//Make the class "Human" also be known as "hu".
    
    Player me = new Player(sb, 250);//We are sending the constructor a Spellbook "sb" and a maxMana "mm/250".
    sb.addSpell(fb);//Get the Spellbook class, get the method "addSpell" from the class, and send it the variable "fb".
    sb.addSpell(r);//Get the Spellbook class, get the method "addSpell" from the class, and send it the variable "r".
    sb.addSpell(h);//Get the Spellbook class, get the method "addSpell" from the class, and send it the variable "h".
    it.addItem(b);//Get the Item class, get the method "addItem" from the class, and send it the variable "b".
    it.addItem(ax);//Get the Item class, get the method "addItem" from the class, and send it the variable "ax".
    it.addItem(sw);//Get the Item class, get the method "addItem" from the class, and send it the variable "sw".
    cre.addCreature(d);//Get the Creature class, get the method "addCreature" from the class, and send it the variable "d".
    cre.addCreature(o);//Get the Creature class, get the method "addCreature" from the class, and send it the variable "o".
    cre.addCreature(hu);//Get the Creature class, get the method "addCreature" from the class, and send it the variable "hu".
    
    System.out.println("Here are the available spells:");//Display the text listed here.
    
    
    ArrayList<Spell> spells =  me.readSpellBook().getSpells();//I am first getting the players Spellbook and then getting the spells in the Spellbook.
    for (Spell s: spells) {//Go through the list of "spells", each thing will be an object of the class "Spell", for the moment call this "s".
    	System.out.println(spells.indexOf(s)+1 + ". " + s.toString());//Print out the list of spells. Arrays start at 0 so that's why we use +1.
    }
    
    String spellPicked = (String) Utilities.getInput();//Get the input and then call it spellPicked.
    int spellPickedInt = Integer.parseInt(spellPicked)-1;//parseInt = This will take the input and try to turn it into an integer.
    Spell spell = me.readSpellBook().getSpells().get(spellPickedInt);//Open the Spellbook, get all of the spells and then select the spell that the user input picked.
    System.out.println("You chose: " + spell);//Print out the spell they chose.
    
    System.out.println("Here are your selectable targets:");//Display the text listed here.
    
    	if(spell instanceof TargetsCreature) {//Check if the spell selected is an instance of TargetsCreature.
    	    ArrayList<Creature> creatures =  cre.viewCreatures();
    	    for (Creature creat: creatures) {//Go through the list of "creatures", each thing will be an object of the class "Creature", for the moment call this a temporary variable "creat".
    	    	System.out.println(creatures.indexOf(creat)+1 + ". " + creat.toString());//Print out the list of items.
    
    	    	
    		    
        	    
    		 }
    	    String creatureChosen = (String) Utilities.getInput();//Get the input and then call it itemChosen.
    	    int creatureChosenInt = Integer.parseInt(creatureChosen)-1;//parseInt = This will take the input and try to turn it into an integer.
    	    Creature creature = cre.viewCreatures().get(creatureChosenInt);//Go to the Item class and run the method "viewItems" and then select the spell that the user input picked.
    	    System.out.println("You chose: " + creature);//Print out the item they chose.
	    }
    	else {
    	if(spell instanceof TargetsItem) {//If it isn't; then check if it's an instance of TargetsItem.
    	    ArrayList<Item> items =  it.viewItems();
    	    for (Item ite: items) {//Go through the list of "items", each thing will be an object of the class "Item", for the moment call this a temporary variable "ite".
    	    	System.out.println(items.indexOf(ite)+1 + ". " + ite.toString());//Print out the list of items.
    	    }
    	    
    	    String itemChosen = (String) Utilities.getInput();//Get the input and then call it itemChosen.
    	    int itemChosenInt = Integer.parseInt(itemChosen)-1;//parseInt = This will take the input and try to turn it into an integer.
    	    Item item = it.viewItems().get(itemChosenInt);//Go to the Item class and run the method "viewItems" and then select the spell that the user input picked.
    	    System.out.println("You chose: " + item);//Print out the item they chose.
    	    
    		}
    	else {
    	if(spell instanceof TargetsLocation) {//If it isn't; then check if it's an instance of TargetsLocation.
    		System.out.println("insert location ArrayList");
    		}
    	}
    }

	
	
	
	
	
	
	//System.out.println("You have " + me.showMana() + " Mana left.");//system.out says the default output method for this program.
	}
}