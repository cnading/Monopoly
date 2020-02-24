package objects;

import program.Data;

public class Go_To_Jail extends Space{




	public Go_To_Jail(String theName, String theType, int thePos) {
		type = theType;
		name = theName;
		position = thePos;
		
		
		
	}

	public void action() {
		System.out.println("Go To Jail!");
		Player p = Data.players.get(Data.turn);
		p.setGoodToGo(false);
		p.setPosition(10);
		p.setJail(true);
		
		Data.players.set(Data.turn, p);
		
	}


	
	

}
