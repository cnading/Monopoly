package program;

import java.util.ArrayList;

import objects.*;


public class Data
{
	static int turn = 0;
	static int numbOfPlayers;
	static Space[] board;// = new Space[40];
	static ArrayList<Player> players = new ArrayList<Player>();
	static ArrayList<String> pieces = new ArrayList<String>();
	static ArrayList<Luck_Card> chestStack = new ArrayList<Luck_Card>();
	static ArrayList<Luck_Card> chanceStack = new ArrayList<Luck_Card>();
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
