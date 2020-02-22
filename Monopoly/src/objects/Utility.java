package objects;

import java.util.Scanner;

import program.Data;

public class Utility extends Space{
protected int cost;
protected int[] fees;
protected int owner;


	public Utility(String theName, String theType, int theCost) {
		type = theType;
		name = theName;
		cost = theCost;
		
		
		
		
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
		Property prop = (Property) Data.board[Data.turn];
	if(owner == Data.turn) {
		System.out.println("Have a nice stay on your property.");
		return;
	}	
	
	// buy prop
	if(owner == -1) {	
	System.out.println("Would you like to buy this property? Y or N");	
	Scanner stringIn = new Scanner(System.in);	
	String input = stringIn.nextLine();
	if(input.toLowerCase().equals("y")) {
		if(p.getBalance() < cost) {
			System.out.println("Sorry, you can't afford this property.");
			return;
		}
		p.addProperty(prop);
		owner = Data.turn;
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
	System.out.println(p2.getName() + "owns this property");
	int theFee = fees[0];
	if(p2.getNumberOfUtilitiesOwned() == 1) {
		theFee *= 4;
	}
	else{
		theFee*= 10;
	}
	System.out.println("You owe $" + theFee + ".");
	p.setBalance(p.getBalance() - theFee);
	p2.setBalance(p.getBalance() + theFee);
	}
	
		
	}


	
	

}
