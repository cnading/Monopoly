package program;

import java.util.ArrayList;

import objects.Player;
import objects.Space;

public class MonopolyRunner
{
	static boolean testRollMode = true;
	static int testingRoll = 4;
	public static void main(String[] args) throws Exception
	{
		
		Intro.intro(); //ask to play
		Settup.settup(); //ask numb of players and make players, make other objects
		Start.start(); //welcome to game
		Start.rules(); //display rules if wanted
		while(Data.numbOfPlayers > 1)
		{
			TurnMenu.turnMenu(); //players turn
		}
		//CongraWinner.congraWinner(); //congradulate the winner
	}
}
