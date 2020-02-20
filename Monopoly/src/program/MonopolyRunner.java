package program;
import monopoly.*;
public class MonopolyRunner
{
	
	public static void main(String[] args) 
	{
    
		Intro.introToGame(); //ask to play
		Settup.settup(); //ask numb of players and make players
		Start.start(); //welcome to game and display rules if wanted
		Initialize.initialize(); //set up static variables and read property names
		while(players.size() > 1)
		{
			TurnMenu.turnMenu(); //players turn
		}
		CongraWinner.congraWinner(); //congradulate the winner
		String[] fileNames = {"ThemeData","SpaceData"};
try {
	Space[] board = Input_File.fillSpaceData(fileNames);
} catch (Exception e) {
	
	e.printStackTrace();
}
	}
}
