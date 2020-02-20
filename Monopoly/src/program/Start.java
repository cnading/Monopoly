package program;

import java.util.Scanner;

public class Start
{

	public static void start(){
		System.out.println("Without futher adue, here is facinating game of text based Monopoly -- The Fast Dealing, Property Trading Game.");
		System.out.println("The Rules of Monopoly are not difficult, but they are highly specific.");
		System.out.println("Are you ready?");
		
		System.out.println("Here are some simple facts to get started...");
		System.out.println("There are 32 houses, 12 hotels, Chance and Community Chest Cards, Title Deeds for each property, money, property and player tokens.");
		System.out.println("");
		
	}
	
	public static void rules() {
		boolean isMakingChoice = true;
		
		while(isMakingChoice) {
		System.out.println("Would you like the rules of the game?");
		System.out.println("(1) Yes Please!");
		System.out.println("(2) No Thanks, I'm Already a Pro");
		
		Scanner intInput = new Scanner(System.in);
		System.out.println("Please enter either 1 or 2.");
		int choice = intInput.nextInt();
		
		if(choice == 1){
			isMakingChoice = true;
			System.out.println("Each player chooses a token and starts on 'Go', provided with $1500, with one player acting as Banker");
			System.out.println("Roll the dice, and you will move the number of squares indicated");
			System.out.println("If you throw doubles, you take another turn, and each time you pass 'Go' you collect $200 from the bank");
			
			System.out.println();
			System.out.println("You may buy any property from the Bank if you land on that space, and it is not already owned.");
			System.out.println("If the property is not purchased, the Banker autctions the property to the highest bidder");
			
			System.out.println();
			System.out.println("You may only build when you own all properties in a color group.");
			System.out.println("You may place a single building on a single property, but you may not place two buildings on one property, ");
			System.out.print("unless all other properties in the group have one building present");
			
			System.out.println();
			System.out.println("Any property can have a total of 4 houses, except Utilities and Railroads, which cannot be developed");
			System.out.println("To place a hotel on a property, 4 houses must be present on all properties in the group");
			System.out.println("Houses are removed from the property when a hotel is placed, and all buildings are purchased from the Bank");
			
			System.out.println();
			System.out.println("You must pay rent as determined by the Title Deed for the property you are on");
			System.out.println("Pay Income Tax to the Bank, which adds up to $200 or 10% of your total assets");
			System.out.println("Draw a Community Chest or Chance card and follow the instructions");
			System.out.println("These cards are returned to the bottom of the pile when the action is completed");
			
			System.out.println();
			System.out.println("There are 3 ways that you can be sent to Jail...");
			System.out.println("1. Land on a space marked 'Go to Jail'");
			System.out.println("2. Draw a card marked 'Go to Jail'");
			System.out.println("3. Roll doubles three times in a row");
			
			System.out.println();
			System.out.println("Subsequently, there are 4 ways to get out of Jail...");
			System.out.println("1. Pay the $50 fine before rolling the dice");
			System.out.println("2. Use a 'Get Out of Jail Free Card'");
			System.out.println("3. Roll doubles");
			System.out.println("4. After the 3rd attempt to roll doubles, you must pay the $50 fine and leave jail");
			
			System.out.println();
			System.out.println("Now what you have been waiting for with bated breath, How to Win!");
			System.out.println();
			System.out.println("Play until every player but one has declared Bankrupcy");
			System.out.println("~ OR ~");
			System.out.println("You chose to end the game, and tally the total worth of each player (including buildings and all property worth)");
			System.out.println();
			System.out.println("Official rules state that the last player in the game, or the player with the most money wins.");
			
			System.out.println();
			System.out.println("If your piece lands on 'Free Parking', you will start to go around the board in the direction opposite to where you were going");
			System.out.println("If you land on it again, then you will proceed to go the opposite direction again");
			System.out.println("");
			
			
		}
		
		if(choice == 2) {
			isMakingChoice = true;
			System.out.println("Well then Pro, let's get into the game!");
			
			System.out.println("Super quickly though, let's review how you can win this game...");
			
			System.out.println();
			System.out.println("Play until every player but one has declared Bankrupcy");
			System.out.println("~ OR ~");
			System.out.println("You chose to end the game, and tally the total worth of each player (including buildings and all property worth)");
			System.out.println();
			System.out.println("Official rules state that the last player in the game, or the player with the most money wins.");
			System.out.println("");
		}
		
		else {
			isMakingChoice = false;
			System.out.println("I'm sorry, that wasn't an option, try again.");
			System.out.println("");
		}
		
		}
		
	}
	
}
