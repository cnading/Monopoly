package program;

import java.util.Scanner;
import objects.*;
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
		int roll1 = (int) (Math.random()*6+1) ;
		int roll2 = (int) (Math.random()*6+1) ;
		Data.rolledDoubles = roll1 == roll2;
		Data.players.get(Data.turn).setGoodToGo(true);
		int roll = roll1 + roll2;
		if(Data.rolledDoubles) {
			Data.doubleCounter++;
		}else {
			Data.doubleCounter = 0;
		}
		if(Data.doubleCounter == 3) {
			Data.doubleCounter = 0;
			System.out.println("You rolled doubles three times in a row!");
			System.out.println("Go To Jail!");
			Data.players.get(Data.turn).setPosition(10);
			Data.players.get(Data.turn).setJail(true);
		}
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
		if(! Data.players.get(Data.turn).isJail()) {
		if(Data.players.get(Data.turn).isGoingBackwards() == false)
		{
			Data.players.get(Data.turn).setPosition(Data.players.get(Data.turn).getPosition()+roll);
		}
		else
		{
			Data.players.get(Data.turn).setPosition(Data.players.get(Data.turn).getPosition()-roll);
		}
		}else if (Data.rolledDoubles) {
			System.out.println("You rolled doubles and got out of Jail!");
			if(Data.players.get(Data.turn).isGoingBackwards() == false)
			{
				Data.players.get(Data.turn).setPosition(Data.players.get(Data.turn).getPosition()+roll);
			}
			else
			{
				Data.players.get(Data.turn).setPosition(Data.players.get(Data.turn).getPosition()-roll);
			}
		}else {

			Data.players.get(Data.turn).setOutOfJailCounter(Data.players.get(Data.turn).getOutOfJailCounter() + 1);
			if(Data.players.get(Data.turn).getOutOfJailCounter() > 2) {
				Data.players.get(Data.turn).setOutOfJailCounter(0);
				System.out.println("You've served your sentence.");
				if(Data.players.get(Data.turn).isGoingBackwards() == false)
				{
					Data.players.get(Data.turn).setPosition(Data.players.get(Data.turn).getPosition()+roll);
				}
				else
				{
					Data.players.get(Data.turn).setPosition(Data.players.get(Data.turn).getPosition()-roll);
				}	
				
			}else {
			System.out.println("Sorry, you're in jail.");
			Data.players.get(Data.turn).setGoodToGo(false);
			}
		}
		//displayBoard
		if(Data.players.get(Data.turn).isGoodToGo()) {
		TextGraphics.setBoardLoc();
		TextGraphics.fillBoard();
		TextGraphics.displayBoard();
		//action
		System.out.println("You landed on " + Data.board[Data.players.get(Data.turn).getPosition()].getName() + ".");
		Data.board[Data.players.get(Data.turn).getPosition()].action();
		}
		if(Data.players.get(Data.turn).getBalance() < 0)
		{
			System.out.println("You lose! You're out of the game. Haha, loser!");
			Data.players.remove(Data.turn);
			Data.numbOfPlayers--;
			//reset there properties here!!!
		}
		//nextTurn
		if(! Data.rolledDoubles) {
		Data.turn++;
		Data.doubleCounter = 0;
		
		if(Data.turn >= Data.numbOfPlayers) {
			Data.turn = 0;
		}
		}else {
		System.out.println("You rolled doubles, go again!");	
		}
	}
	public static void manageProperties() 
	{
		System.out.println("Nothing here yet!"); //add both trading and buying houses here
	}
}
