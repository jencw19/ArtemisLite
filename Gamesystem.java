package game;

import java.util.Random;

public class Gamesystem {

	public static void main(String[] args) {
		
		Element e1 =  new Element("Cargo Hold", "Nasa", true, SystemNames.RED_SYSTEM); 
		e1.displayAll();
		
		rollDice();
		
	}
		
	public static int rollDice() {
			
		int result;
			
		Random r1 = new Random();
		int die1 = r1.nextInt(6);
	
		
		Random r2 = new Random();
		int die2 = r2.nextInt(6);
		
		
		result = die1 + die2;
		result+=2;
		
		System.out.println(result);
		
		return result;
	}

}
