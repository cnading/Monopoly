package program;

public class TextGraphics
{
	public static void setBoardLoc()
	{
		Data.l = new String[40];
		for (int i = 0; i < 40; i++)
		{
			Data.l[i] = " ";
		}
		Data.l[Data.players.get(Data.turn).getPosition()] = "X";
	}
	
	public static void fillBoard()
	{
		Data.textBoard = new String[][] {
				{"+---+---+---+---+---+---+---+---+---+---+---+---+"},
				{"| " + Data.l[21] + " | " + Data.l[22] + " | " + Data.l[23] + " | " + Data.l[24] + " | " + Data.l[25] + " | " + Data.l[26] + " | " + Data.l[27] + " | " + Data.l[28] + " | " + Data.l[29] + " | " + Data.l[30] + " | " + Data.l[31] + " | "},
				{"+---+---+---+---+---+---+---+---+---+---+---+---+"},
				{"| " + Data.l[20] + " |                                       | " + Data.l[32] + " |"},
				{"+---+                                       +---+"},
				{"| " + Data.l[19] + " |                                       | " + Data.l[33] + " |"},
				{"+---+           $               $           +---+"},
				{"| " + Data.l[18] + " |           $ $           $ $           | " + Data.l[34] + " |"},
				{"+---+           $  $         $  $           +---+"},
				{"| " + Data.l[17] + " |           $   $       $   $           | " + Data.l[35] + " |"},
				{"+---+           $    $     $    $           +---+"},
				{"| " + Data.l[16] + " |           $     $   $     $           | " + Data.l[36] + " |"},
				{"+---+           $      $ $      $           +---+"},
				{"| " + Data.l[15] + " |           $       $       $           | " + Data.l[37] + " |"},
				{"+---+           $               $           +---+"},
				{"| " + Data.l[14] + " |           $               $           | " + Data.l[38] + " |"},
				{"+---+           $               $           +---+"},
				{"| " + Data.l[13] + " |                                       | " + Data.l[39] + " |"},
				{"+---+                                       +---+"},
				{"| " + Data.l[12] + " |                                       | " + Data.l[40] + " |"},
				{"+---+---+---+---+---+---+---+---+---+---+---+---+"},
				{"| " + Data.l[11] + " | " + Data.l[10] + " | " + Data.l[9] + " | " + Data.l[8] + " | " + Data.l[7] + " | " + Data.l[6] + " | " + Data.l[5] + " | " + Data.l[4] + " | " + Data.l[3] + " | " + Data.l[2] + " | " + Data.l[1] + " |G" + Data.l[0] + "O|"},
				{"+---+---+---+---+---+---+---+---+---+---+---+---+"}
				};
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
