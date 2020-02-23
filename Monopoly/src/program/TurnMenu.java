package program;

import java.util.ArrayList;
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
		System.out.println(Data.players.get(Data.turn).getName() + "'s" + " (" + Data.players.get(Data.turn).getPiece() +  ") turn! Balance: $" + Data.players.get(Data.turn).getBalance());
		System.out.println("Select what you would like to do.");
		System.out.println("(1) Roll Dice");
		System.out.println("(2) Manage Properties");
		System.out.println("(3) View Position On Board");
		System.out.println("(4) Vote To End Game");
		System.out.print("Input: ");
		choice = intInput.nextInt();
		System.out.println();
		//action
		if(choice == 1)
		{
			rollDice();
		}
		else if(choice == 2)
		{
			manageProperties();
		}
		else if(choice == 3)
		{
			useCards();
		}
		else if(choice == 4)
		{
			endGame();
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
		if(MonopolyRunner.testRollMode) {
			roll = MonopolyRunner.testingRoll;
		}
    Scanner strInput = new Scanner(System.in);
		//rollDice
		System.out.print("Press enter to roll the dice.");
		strInput.nextLine();
		System.out.println();
    System.out.println("You rolled a " + roll + ".");
		Data.players.get(Data.turn).setMostRecentDiceRoll(roll);
		if(Data.rolledDoubles) {
			Data.doubleCounter++;
		}else {
			Data.doubleCounter = 0;
		}
		if(Data.doubleCounter == 3) {
			Data.doubleCounter = 0;
			System.out.println("You rolled doubles three times in a row!");
			System.out.println("Go To Jail!");
			Data.players.get(Data.turn).setGoodToGo(false);
			Data.players.get(Data.turn).setPosition(10);
			Data.players.get(Data.turn).setJail(true);
			
		}


		
		

		
		
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
			Data.players.get(Data.turn).setOutOfJailCounter(0);
			Data.players.get(Data.turn).setJail(false);
			if(Data.players.get(Data.turn).isGoingBackwards() == false)
			{
				Data.players.get(Data.turn).setPosition(Data.players.get(Data.turn).getPosition()+roll);
			}
			else
			{
				Data.players.get(Data.turn).setPosition(Data.players.get(Data.turn).getPosition()-roll);
			}
		}
		else if(Data.players.get(Data.turn).getGetOutOfJailFreeCards() > 0) {
			System.out.println("You used your get out of Jail Free Card!");
			Data.players.get(Data.turn).setOutOfJailCounter(0);
			Data.players.get(Data.turn).setJail(false);
			Data.players.get(Data.turn).setGetOutOfJailFreeCards(Data.players.get(Data.turn).getGetOutOfJailFreeCards() -1);
			if(Data.players.get(Data.turn).isGoingBackwards() == false)
			{
				Data.players.get(Data.turn).setPosition(Data.players.get(Data.turn).getPosition()+roll);
			}
			else
			{
				Data.players.get(Data.turn).setPosition(Data.players.get(Data.turn).getPosition()-roll);
			}
		}
		else {

			Data.players.get(Data.turn).setOutOfJailCounter(Data.players.get(Data.turn).getOutOfJailCounter() + 1);
			if(Data.players.get(Data.turn).getOutOfJailCounter() > 2) {
				Data.players.get(Data.turn).setOutOfJailCounter(0);
				Data.players.get(Data.turn).setJail(false);
				
				System.out.println("You've served your sentence.");
				
				if(Data.players.get(Data.turn).isGoingBackwards() == false)
				{
					Data.players.get(Data.turn).setPosition(Data.players.get(Data.turn).getPosition()+roll);
				}
				else
				{
					Data.players.get(Data.turn).setPosition(Data.players.get(Data.turn).getPosition()-roll);
				}	
				Data.players.get(Data.turn).setBalance(Data.players.get(Data.turn).getBalance() - 50);
			}else {
			System.out.println("Sorry, you're in jail.");
			Data.players.get(Data.turn).setGoodToGo(false);
			}
		}
		//displayBoard
		// I moved this to set Position in Player object
		
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
		//var
		int choice;
		Scanner intInput = new Scanner(System.in);
		//getOption
		System.out.println("Select an option from the list below.");
		System.out.println("(1) View Properties");
		System.out.println("(2) Mortgage Properties");
		System.out.println("(3) Trade Properties");
		System.out.println("(4) Buy Houses/Hotels");
		System.out.print("Input: ");
		choice = intInput.nextInt();
		//action
		if(choice == 1)
		{
			System.out.print("Properties:");
			
			if(Data.players.get(Data.turn).getProperties().size() == 0)
			{
				System.out.println(" none");
			}else {
				for(Space p: Data.players.get(Data.turn).getProperties())
				{
					
					System.out.print(" \"" + p.getName() + "\"");
				}
			}
			
			System.out.println("");
		}
		if(choice == 2)
		{
			System.out.println("Nothing here yet!");
			System.out.println("");
		}
		if(choice == 3)
		{
			System.out.println("Nothing here yet!");
			System.out.println("");
		}
		if(choice == 4)
		{
			buyHousesMenu();
		}
		//add both trading and buying houses here
	}
	
	



	public static void useCards() 
	{
		TextGraphics.setBoardLoc();
		TextGraphics.fillBoard();
		TextGraphics.displayBoard();
	}
	
	public static void buyHousesMenu() {
		int choice;
		Scanner intInput = new Scanner(System.in);
		//getOption
		
		System.out.println();
		int counter = 0;
		ArrayList<Property> props= new ArrayList<Property>();
		for(Space s: Data.players.get(Data.turn).getProperties()) {
			if(s.getType().equals("Property")) {
				counter++;
				props.add((Property) s);
				System.out.println("(" + counter + ") " + s.getName());
				
			}
		}
		
		if(counter == 0) {
			System.out.println("Sorry, you have no properties that you can add houses/hotels to");
			return;
		}
		System.out.println();
		System.out.println("Please choose the property you would like to add houses/hotels to.");
		System.out.print("Input: ");
		int choice2 = intInput.nextInt();
		System.out.println();
		System.out.println("Select an option from the list below.");
		System.out.println("(1) Buy Houses");
		System.out.println("(2) Buy Hotels");
		System.out.print("Input: ");
		choice = intInput.nextInt();
		if(choice == 1) {
			System.out.println();
			int numHouses = ((Property) Data.players.get(Data.turn).getProperties().get(Data.players.get(Data.turn).getProperties().indexOf(props.get(choice2 - 1)))).getHouses();
			int tempNumHouse = numHouses;
			if(numHouses > 4) {
				tempNumHouse = 4;
			}
			System.out.println("How many houses would you like to buy? Current number of houses: " + tempNumHouse);
			System.out.print("Input: ");
			int choice3 = intInput.nextInt();
			System.out.println();
			if(numHouses + choice3 < 5){
				((Property) Data.players.get(Data.turn).getProperties().get(Data.players.get(Data.turn).getProperties().indexOf(props.get(choice2 - 1)))).addHouses(choice3);
			int index = ((Property) Data.players.get(Data.turn).getProperties().get(Data.players.get(Data.turn).getProperties().indexOf(props.get(choice2 - 1)))).getPosition();
			Data.board[index] = ((Property) Data.players.get(Data.turn).getProperties().get(Data.players.get(Data.turn).getProperties().indexOf(props.get(choice2 - 1))));
			System.out.println("" + choice3 + " houses were added to " + Data.players.get(Data.turn).getProperties().get(Data.players.get(Data.turn).getProperties().indexOf(props.get(choice2 - 1))).getName() + ".");	
			Data.players.get(Data.turn).setBalance(Data.players.get(Data.turn).getBalance() -  ((Property) Data.players.get(Data.turn).getProperties().get(Data.players.get(Data.turn).getProperties().indexOf(props.get(choice2 - 1)))).getHousePrice()  * choice3);
			Data.players.get(Data.turn).setNumberOfHouses(Data.players.get(Data.turn).getNumberOfHouses() + 1);
			}else {
				System.out.println("Sorry, you can't buy that many houses.");
				return;
			}
			
			
			
			
		}
		if(choice == 2) {
			System.out.println();
			int numHouses = ((Property) Data.players.get(Data.turn).getProperties().get(Data.players.get(Data.turn).getProperties().indexOf(props.get(choice2 - 1)))).getHouses();
			if(numHouses == 4) {
				((Property) Data.players.get(Data.turn).getProperties().get(Data.players.get(Data.turn).getProperties().indexOf(props.get(choice2 - 1)))).addHouses(1);	
				((Property) Data.players.get(Data.turn).getProperties().get(Data.players.get(Data.turn).getProperties().indexOf(props.get(choice2 - 1)))).addHotels(1);
				int index = ((Property) Data.players.get(Data.turn).getProperties().get(Data.players.get(Data.turn).getProperties().indexOf(props.get(choice2 - 1)))).getPosition();
				Data.board[index] = ((Property) Data.players.get(Data.turn).getProperties().get(Data.players.get(Data.turn).getProperties().indexOf(props.get(choice2 - 1))));
				System.out.println("A hotel was added to " + Data.players.get(Data.turn).getProperties().get(Data.players.get(Data.turn).getProperties().indexOf(props.get(choice2-1 ))).getName() + ".");	
				Data.players.get(Data.turn).setBalance(Data.players.get(Data.turn).getBalance() - ((Property) Data.players.get(Data.turn).getProperties().get(Data.players.get(Data.turn).getProperties().indexOf(props.get(choice2 - 1)))).getHousePrice());				
				Data.players.get(Data.turn).setNumberOfHotels(Data.players.get(Data.turn).getNumberOfHotels() + 1);
			}else {
				System.out.println("You can't put a hotel on this property at the moment.");
				return;
			}
			
			
			
			
			
		}
			
			
		
		
		
		
	}
	
	
	public static void endGame() {
		if( ! Data.players.get(Data.turn).isVotedToEndGame()) {
			Data.votesToEndGame ++;
			Data.players.get(Data.turn).setVotedToEndGame(true);;
		}
		System.out.print("You've voted to end the game. Votes " + Data.votesToEndGame + "/" + Data.numbOfPlayers);
		System.out.println();
		
		if(Data.votesToEndGame >= Data.numbOfPlayers) {
		reallyEndTheGame();
			
		}
		
	}
	public static void reallyEndTheGame() {
		int max = 0; 
		Player pe = null;
		for(Player p: Data.players) {
			if(p.getBalance() > max) {
			pe = p;	
			}
		}
		System.out.println();
		System.out.println(pe.getName() + " (" + pe.getPiece() + ") has won the game with $" + pe.getBalance() + "!!!");
		System.out.println("Thanks for playing.");
		System.exit(0);
	}
}
