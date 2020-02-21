package program;

import java.util.ArrayList;

import objects.Player;
import objects.Space;

public class Data
{
	static int turn = 0;
	static int numbOfPlayers;
	static Space[] board;// = new Space[40];
	static ArrayList<Player> players = new ArrayList<Player>();
	static ArrayList<String> pieces = new ArrayList<String>();
	static String[] files = {"ThemeData", "SpaceData"};
	static String [] l = new String[] {"X"};
	static String[][] textBoard = {
			{"+---+---+---+---+---+---+---+---+---+---+"},
			{"| " + l[0] + " | " + l[0] + " | " + l[0] + " | " + l[0] + " | " + l[0] + " | " + l[0] + " | " + l[0] + " | " + l[0] + " | " + l[0] + " | " + l[0] + " |"},
			{"+---+---+---+---+---+---+---+---+---+---+"},
			{"| " + l[0] + " |                               | " + l[0] + " |"},
			{"+---+                               +---+"},
			{"| " + l[0] + " |                               | " + l[0] + " |"},
			{"+---+       $               $       +---+"},
			{"| " + l[0] + " |       $ $           $ $       | " + l[0] + " |"},
			{"+---+       $  $         $  $       +---+"},
			{"| " + l[0] + " |       $   $       $   $       | " + l[0] + " |"},
			{"+---+       $    $     $    $       +---+"},
			{"| " + l[0] + " |       $     $   $     $       | " + l[0] + " |"},
			{"+---+       $      $ $      $       +---+"},
			{"| " + l[0] + " |       $       $       $       | " + l[0] + " |"},
			{"+---+       $               $       +---+"},
			{"| " + l[0] + " |                               | " + l[0] + " |"},
			{"+---+                               +---+"},
			{"| " + l[0] + " |                               | " + l[0] + " |"},
			{"+---+---+---+---+---+---+---+---+---+---+"},
			{"| " + l[0] + " | " + l[0] + " | " + l[0] + " | " + l[0] + " | " + l[0] + " | " + l[0] + " | " + l[0] + " | " + l[0] + " | " + l[0] + " | " + l[0] + " |"},
			{"+---+---+---+---+---+---+---+---+---+---+"}
			};
}
