package objects;

import program.Data;

public class Free_Parking extends Space{




	public Free_Parking(String theName, String theType) {
		type = theType;
		name = theName;
		
		
		
		
	}

	public void action() {
		Player p = Data.players.get(Data.turn);
		p.setBalance(p.getBalance() + Data.moneyPile);
		Data.moneyPile = 0;
		p.setGoingBackwards(true);
		Data.players.set(Data.turn, p);
	}


	
	

}
