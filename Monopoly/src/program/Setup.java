package program;

import java.util.Scanner;

public class Setup {

	public static void main(String[] args) {
		// TODO set up all we need in terms of players and characters
		//Asking number of players
		//Establishing characters for each of the players
		//not sure what else to add into this class
		
        System.out.println("Ideally you need between 2-8 people, but how many people are in your party?");
		
		Scanner intInput = new Scanner(System.in);
		System.out.println("Please enter the number of players for the game...");
		int numberOfPlayers = intInput.nextInt();

	}

}
