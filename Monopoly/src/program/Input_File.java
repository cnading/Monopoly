package program;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import objects.*;

public class Input_File {
	static int numberOfFields = 4;
	
	public static Space[] fillSpaceData(String[] fileNames) throws Exception{
		// fileNames are for Names, and Space Data




        // The name of the file to open.
Space[] thisIsIt= new Space[40];
String[] names = new String[40];
String[] types = new String[40];
ArrayList<ArrayList> info = new ArrayList<ArrayList>();

        // This will reference one line at a time
for(int i = 0; i < fileNames.length; i++) {
String fileName = fileNames[i];
        try 
        	{
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
int counter = 0;
            String line;
			while(((line = bufferedReader.readLine()) != null)) 
            	{
				switch(i) {
				case 0: 
					String[] stoof = line.split(" ");

					String namey = stoof[1];
					if(stoof.length > 1) {
					for(int k = 2; k < stoof.length; k++) {
						namey += " " + stoof[k];
					}
					}
				names[counter] = namey;
				break;
				case 1: 
					String infer[] = line.split(" ");
					String type = infer[1].substring(0, infer[1].length() - 1);
					types[counter] = type;
					ArrayList stuffToAdd = new ArrayList();
					if(infer.length > 2) {
					for(int j = 2; j < infer.length; j++) {
						stuffToAdd.add(infer[j]);
						
						}
					}
					info.add(stuffToAdd);
					}
            	
					
				
				counter++;
				
				

            // Always close files.
            	}
            bufferedReader.close();			
        	
        	}
        catch(FileNotFoundException ex) 
        	{
            System.out.println(
                "Unable to open file '" + fileName + "'");				
        	}
        catch(IOException ex) 
        	{
            System.out.println(
                "Error reading file '" + fileName + "'");					
            // Or we could just do this: ex.printStackTrace();
        	}
}

for(int i = 0; i < 40; i++) {
switch(types[i]) {
case "Property": 
	int price = Integer.parseInt((String) info.get(i).get(0));
	int[] someFees = new int[6];
	for(int j = 1; j < 7; j++) {
		int data = Integer.parseInt((String) info.get(i).get(j));
		someFees[j - 1] = data;
	}
	int housePrice = Integer.parseInt((String) info.get(i).get(7));
	thisIsIt[i] = new Property(names[i], types[i], price, someFees, housePrice, i);
	break;
	
	
case "Railroad": 	
	int price2 = Integer.parseInt((String) info.get(i).get(0));
	int[] someFees2 = new int[4];
	for(int j = 1; j < info.get(i).size(); j++) {
		int data = Integer.parseInt((String) info.get(i).get(j));
		someFees2[j - 1] = data;
	}

	thisIsIt[i] = new Railroad(names[i], types[i], price2, someFees2, i);
	break;
	
	
case "Income_Tax": 
	
	int[] someFees3 = new int[2];
	for(int j = 0; j < info.get(i).size(); j++) {
		int data = Integer.parseInt((String) info.get(i).get(j));
		someFees3[j] = data;
	}
	
	thisIsIt[i] = new Income_Tax(names[i], types[i], someFees3, i);
	break;
	
case "Luxury_Tax": 
	int[] someFees4 = new int[1];
	for(int j = 0; j < info.get(i).size(); j++) {
		int data = Integer.parseInt((String) info.get(i).get(j));
		someFees4[j] = data;
	}
	
	thisIsIt[i] = new Luxury_Tax(names[i], types[i], someFees4, i);
	break;
	
case "Luck": 
	thisIsIt[i] = new Luck(names[i], types[i], i);
	break;
	
case "Jail": 
	thisIsIt[i] = new Jail(names[i], types[i], i);
	break;
	
case "Free_Parking": 
	thisIsIt[i] = new Free_Parking(names[i], types[i], i);
	break;
	
case "Go_To_Jail": 
	thisIsIt[i] = new Go_To_Jail(names[i], types[i], i);
	break;
	
case "Go": 
	thisIsIt[i] = new Go(names[i], types[i], i);
	break;
	
case "Utility": 
	int price5 = Integer.parseInt((String) info.get(i).get(0));
	
	
	thisIsIt[i] = new Utility(names[i], types[i], price5, i);
	break;
	default:
		System.out.println("Something's wrong with the file.");
	
}
}
        return thisIsIt;
		
	}
	
	public static ArrayList<Luck_Card> fillChestCards(String fileName, boolean chestCards) {
		ArrayList<Luck_Card> stack= new ArrayList<Luck_Card>();
		

        try 
        	{
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
int counter = 0;
            String line;
			while(((line = bufferedReader.readLine()) != null)) 
            	{
stack.add(new Luck_Card(line, chestCards, counter));				
counter++;
            // Always close files.
            	}
            bufferedReader.close();			
        	
        	}
        catch(FileNotFoundException ex) 
        	{
            System.out.println(
                "Unable to open file '" + fileName + "'");				
        	}
        catch(IOException ex) 
        	{
            System.out.println(
                "Error reading file '" + fileName + "'");					
            // Or we could just do this: ex.printStackTrace();
        	}
		
		
		
		Collections.shuffle(stack);
		return stack;
	}
	
	
}
