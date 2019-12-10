package game;

import java.util.Scanner;

public class Utilities {



	

public static Object getInput(){//static they belong to teh class not the instance, we dont need to give it an object type(instance) to use it. this method will return an object of type object

	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Choose a number: ");
	String input = keyboardInput.nextLine();
	return input;
	

}
}