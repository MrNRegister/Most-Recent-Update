package game;

public abstract class Spell {
	
	private boolean pluggedIn;//This is saying that pluggedin is a boolean.
	private boolean switchedOn; //This is saying that switchedon is a boolean.
	
	public Spell() {//This is saying that for each new electric object that is created, set the behaviours pluggedIn and switchedOn to off.
	pluggedIn = false;
	switchedOn = false;

	}

public void plugIn(){//Void means it doesn't need any other necessary information.
	pluggedIn = true;
	System.out.println("The kettle has now been plugged in and the value of if it's switched on as well as the current capacity is listed below:");
}
public void unPlug(){
	pluggedIn = false;
	System.out.println("this is unplugging");
}

public void switchOn(){
	switchedOn = true;
	System.out.println("this is switchingon");
}

public void switchOff(){
	switchedOn = false;
	System.out.println("this is switchingoff");
}

public void pressSwitch(){
	if (pluggedIn){	
		
		if(switchedOn)
		switchedOn = false;
		else {
		switchedOn = true;
		}
	}
	else {
		System.out.println("not plugged in");
	}
}

public boolean isSwitchedOn() {
	
	return switchedOn;
	
}

}


