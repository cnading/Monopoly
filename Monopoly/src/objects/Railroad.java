package objects;

public class Railroad extends Space{
protected int cost;
protected int[] fees;
protected Player owner;


	public Railroad(String theName, String theType, int theCost, int[] theFees) {
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
		if(owner != null) {
		return fees[owner.getNumberOfRailroadsOwned() -1];
		}
		else {
			return 0;
		}
	}

	public void setFees(int[] fees) {
		this.fees = fees;
	}


	public Player getOwner() {
		return owner;
	}


	public void setOwner(Player owner) {
		this.owner = owner;
	}


	public void action() {
		
		
	}


	
	

}
