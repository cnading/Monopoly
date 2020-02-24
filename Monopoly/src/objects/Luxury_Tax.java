package objects;

import program.Data;

public class Luxury_Tax extends Space{

protected int[] fees;



	public Luxury_Tax(String theName, String theType, int[] theFees, int thePos) {
		type = theType;
		name = theName;
		fees = theFees;
		position = thePos;
		
		
	}

	public int[] getFees() {
		return fees;
	}
	public int getFeeToPlayer() {
return fees[0];
	}

	public void setFees(int[] fees) {
		this.fees = fees;
	}


	public void action() {
		Player p = Data.players.get(Data.turn);
		p.setBalance(p.getBalance() - fees[0]);
		Data.players.set(Data.turn, p);
	}


	
	

}
