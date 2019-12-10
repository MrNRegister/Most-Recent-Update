package game;

public class Fireball extends Spell implements TargetsLocation {
	final int MANA_COST = 50;//By declaring this as final it saves more memory space as the program knows it's an absolute value that won't change. If later on we decided that fire mage gets -10% to mana required for all fire spells, we'd have to change this.

	public Fireball() {//This is the constructor that runs when a new instance of the Fireball class is created.
		
		
		
	}

		
	public void castFireball(Player p) {//We are sending it the information of who is casting it, call this "p" as a variable.
	if (p.checkMana(MANA_COST)) {//Check the player's "p" mana value (the checkMana method is done in the player class) if it's the required amount; then run the method castFireball.
		System.out.println("You cast a fireball.");//Print out this line.
	}
	else {//This is saying that if not, or otherwise.
		System.out.println("You don't have enough mana to cast a Fireball.");//Then do this, which is display an error message.
	}
}
	
	@Override
	public  String toString() {
		return "Fireball, a glowing ball of flame.";
	}
	
}