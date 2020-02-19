package monopoly;

import objects.Player;

public class Property extends Space{
protected int cost;
protected int[] fees;
protected int houses;
protected int hotels;
protected Player owner;


	public Property(String theName, String theType, int theCost, int[] theFees) {
		type = theType;
		name = theName;
		cost = theCost;
		fees = theFees;
		
		
		
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
	public int getFeeToPlayer() {
		if(hotels == 1) {
			return fees[5];
		}
		else{
			return fees[houses];
		}

	}

	public void setFees(int[] fees) {
		this.fees = fees;
	}


	public int getHouses() {
		return houses;
	}


	public void setHouses(int houses) {
		this.houses = houses;
	}


	public int getHotels() {
		return hotels;
	}


	public void setHotels(int hotels) {
		this.hotels = hotels;
	}


	public Player getOwner() {
		return owner;
	}


	public void setOwner(Player owner) {
		this.owner = owner;
	}


	protected void action() {
		
		
	}


	
	

}
