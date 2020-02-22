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
		System.out.println("Its just like regular Monoploy without the fun!");
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
	}
}
