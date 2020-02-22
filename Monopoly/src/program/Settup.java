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
		ArrayList<Space> blank = new ArrayList<Space>();
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
		Data.board = Input_File.fillSpaceData(Data.files); 
		Data.chestStack = Input_File.fillChestCards("CommunityChestCards", true);
		Data.chanceStack = Input_File.fillChestCards("ChanceCards", false);
		
	//Community Chest Card methods:
		
		LuckyLuhny l;
		// 1.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 2.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);	
		// 3.	
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 4.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);	
		// 5.	
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 6.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);	
		// 7.	
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 8.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 9.			
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 10.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);	
		// 11.	
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 12.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);	
		// 13.	
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 14.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);	
		// 15.	
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 16.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 17.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);	
		// 18.	
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 19.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);	
		// 20.	
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 21.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);	
		// 22.	
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 23.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);	
		// 24.		
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 26.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);	
		// 27.	
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 28.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);	
		// 29.	
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 30.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);	
		// 31.	
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		// 32.
		l = (Player p) -> {
			
			
		};
		Data.chestCardMethods.add(l);
		
	//Community Chest Card methods:
	
		LuckyLuhny m;
		// 1.
		m = (Player p) -> {
					
					
		};
		Data.chanceCardMethods.add(m);	
		// 2.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);		
		// 3.
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);		
		// 4.
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 5.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);
		// 6.		
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 7.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 8.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 9.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 10.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 11.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 12.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 13.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 14.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 15.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 16.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 17.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 18.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 19.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 20.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 21.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 22.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 23.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 24.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 25.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 26.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 27.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);
		// 28.		
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 29.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 30.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 31.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);	
		// 32.	
		m = (Player p) -> {
			
			
		};
		Data.chanceCardMethods.add(m);		
		
		
		
		
	}
}
