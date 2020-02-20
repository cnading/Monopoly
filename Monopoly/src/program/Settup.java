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
		System.out.print("Input:");
		Data.numbOfPlayers = intInput.nextInt();
		System.out.println("");
		
		//makePlayers
		for(int i = 0; i < Data.numbOfPlayers; i++)
		{
			//getName
			System.out.println("Sup new player!");
			System.out.println("Enter your name.");
			System.out.print("Input:");
			name = strInput.nextLine();
			//getPiece
			System.out.println("Select a piece from the list below.");
			for(String p: Data.pieces)
			{
				System.out.println("(" + count + ")" + p);
				count++;
			}
			count = 1;
			System.out.print("Input:");
			pieceNumb = intInput.nextInt()-1;
			piece = Data.pieces.get(pieceNumb);
			Data.pieces.remove(pieceNumb);
			//makeObject
			Data.players.add(new Player(name, piece, false, 1500, 0, blank));
			//displayPlayer
			System.out.println("Welcome to Monopoly, " + Data.players.get(i).getName() + "!");
			System.out.println("You are the " + Data.players.get(i).getPiece() + " piece.");
			System.out.println("");
		}
		
		//makeBoard
		//Data.board = Input_File.fillSpaceData(Data.files); //Fix this!!! Setup the files array properly in Data.
	}

}
