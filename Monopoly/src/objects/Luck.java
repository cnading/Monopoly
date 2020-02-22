package objects;

import program.Data;

public class Luck extends Space{




	public Luck(String theName, String theType) {
		type = theType;
		name = theName;
		
		
		
		
	}

	public void action() {
		System.out.println("Drawing card...");
		Player p = Data.players.get(Data.turn);
		Luck_Card lc;
		if(Data.board[p.getPosition()].getName().equals("Chance")) {
			lc = Luck_Card.drawCard(false);
			System.out.println("You've drawn the card \"" + lc.getName() + "\"");
			lc.theAction(false);
		}
		else {
		lc = Luck_Card.drawCard(true);
		System.out.println("You've drawn the card \"" + lc.getName() + "\"");
		lc.theAction(true);
		}
		Data.players.set(Data.turn, p);
		
	}


	
	

}
