package program;

public class MonopolyRunner
{
	
	public static void main(String[] args)
	{
		Intro.intro();
		Setup.setup();
		Start.start();
		Initialize.initialize();
		while(players.size() > 1)
		{
			TurnMenu.turnMenu();
		}
		CongraWinner.congraWinner();
	}
}
