package program;

public class MonopolyRunner
{
	
	public static void main(String[] args)
	{
		try {
			String[] names = Input_File.readFile("ThemeData");
			System.out.println(names);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
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
