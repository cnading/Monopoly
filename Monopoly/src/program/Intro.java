package program;

import java.util.Scanner;

public class Intro 
{
	public static void intro()
	{
		//vars
		String yOrN = "";
		Scanner strInput = new Scanner(System.in);
		
		//getInput
		System.out.println("Welcome to the fabulous game of text based Monopoly!");
		System.out.println("It's just like regular Monoploy without the fun!");
		System.out.println();
		System.out.println("Would you like to play? Y or N.");
		System.out.print("Input: ");
		yOrN = strInput.nextLine().toLowerCase();
		
		//action
		if(yOrN.equals("y"))
		{
			System.out.println("Good choice!\n");
		}
		else if(yOrN.equals("n"))
		{
			System.out.println("Too bad you are playing anyways.\n");
		}
		else
		{
			System.out.println("I'll take that as a yes!\n");
		}
		
		//getInput
				System.out.println();
				System.out.println("Which theme would you like to play? Classic(1) or Mystery(2).");
				System.out.print("Input: ");
				String yOrN2 = strInput.nextLine().toLowerCase();
				
				//action
				if(yOrN2.equals("1"))
				{
					String[] temp = {"ThemeData", "SpaceData"};
					Data.files = temp;
				}
				else if(yOrN2.equals("2"))
				{
					String[] temp = {"ThemeData2", "SpaceData"};
					Data.files = temp;
				}
				else
				{
					System.out.println("You had one job.");
				}
		
	}
}
