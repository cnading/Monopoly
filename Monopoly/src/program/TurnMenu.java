package program;

import java.util.Scanner;

public class TurnMenu
{
	public static void turnMenu()
	{
		//var
		int choice;
		Scanner intInput = new Scanner(System.in);
		//selectOption
		System.out.println();
		System.out.println(Data.players.get(Data.turn).getName()  + "  (" + Data.players.get(Data.turn).getPiece() +  ")'s turn!");
		System.out.println("Select what you would like to do.");
		System.out.println("(1) Roll Dice");
		System.out.println("(2) Manage Properties");
		System.out.print("Input: ");
		choice = intInput.nextInt();
		//action
		if(choice == 1)
		{
			rollDice();
		}
		else
		{
			manageProperties();
		}
	}
	
	public static void rollDice()
	{
		//var
		int roll = (int) ((Math.random()*6+1) + (Math.random()*6+1));
if(MonopolyRunner.testRollMode) {
	roll = MonopolyRunner.testingRoll;
}
		Scanner strInput = new Scanner(System.in);
		//rollDice
		System.out.println("Press enter to roll the dice.");
		strInput.nextLine();
		System.out.println("You rolled a " + roll + ".");
		Data.players.get(Data.turn).setMostRecentDiceRoll(roll);
		//setLocation
		if(Data.players.get(Data.turn).isGoingBackwards() == false)
		{
			Data.players.get(Data.turn).setPosition(Data.players.get(Data.turn).getPosition()+roll);
		}
		else
		{
			Data.players.get(Data.turn).setPosition(Data.players.get(Data.turn).getPosition()-roll);
		}
		//displayBoard
		TextGraphics.setBoardLoc();
		TextGraphics.fillBoard();
		TextGraphics.displayBoard();
		//action
		System.out.println("You landed on " + Data.board[Data.players.get(Data.turn).getPosition()].getName() + ".");
		Data.board[Data.players.get(Data.turn).getPosition()].action();
		if(Data.players.get(Data.turn).getBalance() < 0)
		{
			System.out.println("You lose! You're out of the game. Haha, loser!");
			Data.players.remove(Data.turn);
			Data.numbOfPlayers--;
			//reset there properties here!!!
		}
		//nextTurn
		Data.turn++;
		if(Data.turn >= Data.numbOfPlayers) {
			Data.turn = 0;
		}
	}
	public static void manageProperties() 
	{
		System.out.println("Nothing here yet!"); //add both trading and buying houses here
	}
}
