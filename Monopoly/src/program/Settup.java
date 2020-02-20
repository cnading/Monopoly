package program;

import java.util.ArrayList;
import java.util.Scanner;
import objects.*;

public class Settup {

	public static void settup() throws Exception 
	{
		//var
		String name;
		String piece;
		int pieceNumb;
		ArrayList<String> blank = new ArrayList<String>();
		Scanner intInput = new Scanner(System.in);
		Scanner strInput = new Scanner(System.in);
		int count = 1;
		
		//fillPieces
		Data.pieces.add("Money Bag");
		Data.pieces.add("Battle Ship");
		Data.pieces.add("Hat");
		Data.pieces.add("Dog");
		Data.pieces.add("Thimble");
		Data.pieces.add("Shoe");
		Data.pieces.add("Cat");
		Data.pieces.add("Robot");
		
		//fillFiles
	
		//getPlayerCount
        System.out.println("Ideally you need between 2-8 people, how many people are in your party?");
		System.out.println("Please enter the number of players for the game...");
		Data.numbOfPlayers = intInput.nextInt();
		
		//makePlayers
		for(int i = 0; i < Data.numbOfPlayers; i++)
		{
			//getName
			System.out.println("Welcome new Player!");
			System.out.println("Enter your name.");
			name = strInput.nextLine();
			//getPiece
			System.out.println("Select a piece from the list below.");
			for(String p: Data.pieces)
			{
				System.out.println("(" + count + ")" + p);
				count++;
			}
			pieceNumb = intInput.nextInt();
			piece = Data.pieces.get(pieceNumb);
			Data.pieces.remove(pieceNumb);
			//makeObject
			Data.numbOfPlayers++;
			Data.players.add(new Player(name, piece, false, i, i, blank));
		}
		
		//makeBoard
		Data.board = Input_File.fillSpaceData(Data.files);
	}

}
