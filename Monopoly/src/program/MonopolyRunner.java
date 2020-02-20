
package program;
import monopoly.*;
public class MonopolyRunner
{
	
	public static void main(String[] args) 
	{
		String[] fileNames = {"ThemeData","SpaceData"};
try {
	Space[] board = Input_File.fillSpaceData(fileNames);
} catch (Exception e) {
	
	e.printStackTrace();
}
//		Intro.intro();
//		Setup.setup();
//		Start.start();
//		Initialize.initialize();
//		while(players.size() > 1)
//		{
//			TurnMenu.turnMenu();
//		}
		
//		Intro.intro();
//		Settup.settup();
//		Start.start();
//		Initialize.initialize();
//		while(players.size() > 1)
//		{
//			TurnMenu.turnMenu();
//		}
//		CongraWinner.congraWinner();
	}
}

