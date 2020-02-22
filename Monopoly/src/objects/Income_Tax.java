package objects;

import program.Data;

public class Income_Tax extends Space{

protected int[] fees;



	public Income_Tax(String theName, String theType, int[] theFees) {
		type = theType;
		name = theName;
	fees = theFees;
		
		
		
	}

	public int[] getFees() {
		return fees;
	}
	public int getFeeToPlayer() {
return 0;
	}

	public void setFees(int[] fees) {
		this.fees = fees;
	}


	public void action() {
		Player p = Data.players.get(Data.turn);
		int cost = fees[1];
		int mayb = ((p.getBalance() * fees[0]) / 100 );
		if( mayb < cost) {
			cost = mayb;
		}
		p.setBalance(p.getBalance() - cost);
		Data.players.set(Data.turn, p);
	}


	
	

}
