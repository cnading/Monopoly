package program;

import java.util.ArrayList;

import objects.*;


public class Data
{
	public static int turn = 0;
	public static int numbOfPlayers;
	public static Space[] board;// = new Space[40];
	public static ArrayList<Player> players = new ArrayList<Player>();
	public static ArrayList<String> pieces = new ArrayList<String>();
	public static ArrayList<Luck_Card> chestStack = new ArrayList<Luck_Card>();
	public static ArrayList<Luck_Card> chanceStack = new ArrayList<Luck_Card>();
	public static ArrayList<LuckyLuhny> chestCardMethods = new ArrayList<LuckyLuhny>();
	public static ArrayList<LuckyLuhny> chanceCardMethods = new ArrayList<LuckyLuhny>();
	public static int moneyPile = 0;
	public static String[] files = {Data.themeFileName, "SpaceData"};
	public static String [] l;
	public static String[][] textBoard;
	public static boolean rolledDoubles;
	public static int doubleCounter;
	public static int votesToEndGame;
	public static boolean goodToGo;
	public static String themeFileName;

}
