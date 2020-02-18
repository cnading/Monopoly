package program;

import java.util.Scanner;

public class Introduction {

	public static void main(String[] args) {
		
		// TODO enter in a time delay
		
		//Need:
		//Name, character choice, intro screen to game
		
		introToGame();
		rules();

	}
	
	public static void introToGame(){
		System.out.println("Welcome to Monopoly -- The Fast Dealing, Property Trading Game.");
		
		System.out.println("Ideally you need between 2-8 people, but how many people are in your party?");
		
		Scanner intInput = new Scanner(System.in);
		System.out.println("Please enter the number of players for the game...");
		int numberOfPlayers = intInput.nextInt();
		
		
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
		}
		
		if(choice == 2) {
			isMakingChoice = true;
			System.out.println("Well then Pro, let's get into the game!");
		}
		
		else {
			isMakingChoice = false;
			System.out.println("I'm sorry, that wasn't an option, try again.");
		}
		
		}
		
	}
	
	
}
