package objects;

import java.util.ArrayList;

public class Player {
	private String name;
	private String piece;
	private boolean jail=false;
	private int balance;
	private int position;
	private int numberOfRailroadsOwned;
	private int mostRecentDiceRoll;
	private boolean goingBackwards;
	private ArrayList <String> properties;
	
	public Player(String n, String p, boolean j, int b, int po, ArrayList<String> pro)
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
		this.balance = balance;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public ArrayList<String> getProperties() {
		return properties;
	}

	public void setProperties(ArrayList<String> properties) {
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
	
}
