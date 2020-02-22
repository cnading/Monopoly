package objects;

import java.util.ArrayList;

public class Player {
	private String name;
	private String piece;
	private boolean jail=false;
	private int balance;
	private int position;
	private int numberOfRailroadsOwned;
	private int numberOfUtilitiesOwned;
	public int getNumberOfUtilitiesOwned() {
		return numberOfUtilitiesOwned;
	}

	public void setNumberOfUtilitiesOwned(int numberOfUtilitiesOwned) {
		this.numberOfUtilitiesOwned = numberOfUtilitiesOwned;
	}
	private int mostRecentDiceRoll;
	private boolean goingBackwards;
	private ArrayList <Property> properties;
	
	public Player(String n, String p, boolean j, int b, int po, ArrayList<Property> pro)
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
if(position>=0) {
		this.position = position%41;
}
else {
	this.position = position + 41;
}
	}

	public ArrayList<Property> getProperties() {
		return properties;
	}

	public void setProperties(ArrayList<Property> properties) {
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
	public void addProperty(Property p) {
		this.properties.add(p);
	}
	
}
