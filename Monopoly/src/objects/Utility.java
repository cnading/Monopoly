package objects;

import java.util.Scanner;

import program.Data;

public class Utility extends Space{

protected int[] fees;
protected int owner;


	public Utility(String theName, String theType, int theCost, int thePos) {
		type = theType;
		name = theName;
		cost = theCost;
		owner = -1;
		position = thePos;
		
		
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public int[] getFees() {
		return fees;
	}

	public void setFees(int[] fees) {
		this.fees = fees;
	}


	public int getOwner() {
		return owner;
	}


	public void setOwner(int owner) {
		this.owner = owner;
	}


	public void action() {
		Player p = Data.players.get(Data.turn);
		Space prop = Data.board[p.getPosition()];
	if(owner == Data.turn) {
		System.out.println("Have a nice stay on your property.");
		return;
	}	
	
	// buy prop
	if(owner == -1) {	
	System.out.println("Would you like to buy this property? It costs $" + cost + ". Y or N");		
	Scanner stringIn = new Scanner(System.in);
	System.out.print("Input: ");
	String input = stringIn.nextLine();
	if(input.toLowerCase().equals("y")) {
		if(p.getBalance() < cost) {
			System.out.println("Sorry, you can't afford this property.");
			return;
		}
		p.addProperty(prop);
		owner = Data.turn;
		p.setBalance(p.getBalance() - cost);
		System.out.println("Congrats, you just bought " + name + ".");
		p.setNumberOfUtilitiesOwned(p.getNumberOfUtilitiesOwned() + 1);
		return;
	}
	

	else {
		return;
		
	}
	}
	
	// owe money
	else {
		
	
	Player p2 = Data.players.get(owner);
	System.out.println(p2.getName() + " owns this property");	
	int theFee = p.getMostRecentDiceRoll();
	if(p2.getNumberOfUtilitiesOwned() == 1) {
		theFee *= 4;
	}
	else{
		theFee*= 10;
	}
	System.out.println("You owe $" + theFee + ".");
	p.setBalance(p.getBalance() - theFee);
	p2.setBalance(p2.getBalance() + theFee);
	Data.players.set(owner, p2);
	}
	Data.players.set(Data.turn, p);
		
	}


	
	

}
