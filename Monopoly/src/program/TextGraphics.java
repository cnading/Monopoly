package program;

public class TextGraphics
{
	public static void wipeboard()
	{
		
	}
	
	public static void fillBoard()
	{
		
	}

	public static void displayBoard()
	{
		for (int r = 0; r < Data.textBoard.length; r++)
		{
			for (int c = 0; c < Data.textBoard[r].length; c++)
			{
				System.out.print(Data.textBoard[r][c]);
			}
			System.out.println("");
		}
	}
}
