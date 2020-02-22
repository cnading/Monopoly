package objects;

import java.util.ArrayList;

import program.Data;
import program.TextGraphics;

public class Player {
	private String name;
	private String piece;
	private boolean jail=false;
	private int balance;
	private int position;
	private int numberOfRailroadsOwned;
	private int numberOfUtilitiesOwned;
	private int outOfJailCounter;
	private boolean goodToGo;
	private int getOutOfJailFreeCards;
	private int numberOfHouses;
	private int numberOfHotels;
	private boolean votedToEndGame;
	public boolean isGoodToGo() {
		return goodToGo;
	}

	public int getGetOutOfJailFreeCards() {
		return getOutOfJailFreeCards;
	}

	public void setGetOutOfJailFreeCards(int getOutOfJailFreeCards) {
		this.getOutOfJailFreeCards = getOutOfJailFreeCards;
	}

	public void setGoodToGo(boolean goodToGo) {
		this.goodToGo = goodToGo;
	}

	public int getOutOfJailCounter() {
		return outOfJailCounter;
	}

	public void setOutOfJailCounter(int outOfJailCounter) {
		this.outOfJailCounter = outOfJailCounter;
	}

	public int getNumberOfUtilitiesOwned() {
		return numberOfUtilitiesOwned;
	}

	public void setNumberOfUtilitiesOwned(int numberOfUtilitiesOwned) {
		this.numberOfUtilitiesOwned = numberOfUtilitiesOwned;
	}
	private int mostRecentDiceRoll;
	private boolean goingBackwards;
	private ArrayList <Space> properties;
	
	public Player(String n, String p, boolean j, int b, int po, ArrayList<Space> pro)
	{
		name = n;
		piece = p;
		jail = j;
		balance = b;
		position = po;
		properties = pro;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPiece() {
		return piece;
	}

	public void setPiece(String piece) {
		this.piece = piece;
	}

	public boolean isJail() {
		return jail;
	}

	public void setJail(boolean jail) {
		this.jail = jail;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		//implement see if player lost
		System.out.println(name + ", your new balance is $" + balance + ".");
		this.balance = balance;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		
		
if(position>=40) {
	System.out.println("You passed Go, collect $200");
	setBalance(getBalance() + 200);
		this.position = position%40;
}
else if(position < 0){
	System.out.println("You passed Go, collect $200");
	setBalance(getBalance() + 200);
	this.position = position + 40;
}
else {
	this.position = position;
}


// moved stuff

if(goodToGo) {
	TextGraphics.setBoardLoc();
	TextGraphics.fillBoard();
	TextGraphics.displayBoard();
	//action
	System.out.println("You landed on " + Data.board[Data.players.get(Data.turn).getPosition()].getName() + ".");
	Data.board[Data.players.get(Data.turn).getPosition()].action();
	}
	}

	public ArrayList<Space> getProperties() {
		return properties;
	}

	public void setProperties(ArrayList<Space> properties) {
		this.properties = properties;
	}

	public int getNumberOfRailroadsOwned() {
		return numberOfRailroadsOwned;
	}

	public void setNumberOfRailroadsOwned(int numberOfRailroadsOwned) {
		this.numberOfRailroadsOwned = numberOfRailroadsOwned;
	}

	public int getMostRecentDiceRoll() {
		return mostRecentDiceRoll;
	}

	public void setMostRecentDiceRoll(int mostRecentDiceRoll) {
		this.mostRecentDiceRoll = mostRecentDiceRoll;
	}

	public boolean isGoingBackwards() {
		return goingBackwards;
	}

	public void setGoingBackwards(boolean goingBackwards) {
		this.goingBackwards = goingBackwards;
	}
	public int getNumberOfHouses() {
		return numberOfHouses;
	}

	public void setNumberOfHouses(int numberOfHouses) {
		this.numberOfHouses = numberOfHouses;
	}

	public int getNumberOfHotels() {
		return numberOfHotels;
	}

	public void setNumberOfHotels(int numberOfHotels) {
		this.numberOfHotels = numberOfHotels;
	}

	public boolean isVotedToEndGame() {
		return votedToEndGame;
	}

	public void setVotedToEndGame(boolean votedToEndGame) {
		this.votedToEndGame = votedToEndGame;
	}

	public void addProperty(Space p) {
		this.properties.add(p);
	}
	
}
