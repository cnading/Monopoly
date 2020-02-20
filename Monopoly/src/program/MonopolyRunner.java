package program;

public class MonopolyRunner
{
	
	public static void main(String[] args)
	{
		Intro.intro(); //ask to play
		Settup.settup(); //ask numb of players and make players
		Start.start(); //welcome to game
		Start.rules(); //display rules if wanted
		Initialize.initialize(); //set up static variables and read property names
		while(players.size() > 1)
		{
			TurnMenu.turnMenu(); //players turn
		}
		CongraWinner.congraWinner(); //congradulate the winner
	}
}
