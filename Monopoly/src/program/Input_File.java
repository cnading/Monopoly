package program;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import monopoly.*;

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
				names[counter] = line.split(" ")[1];
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
	int[] someFees = new int[5];
	for(int j = 1; j < info.get(i).size(); j++) {
		int data = Integer.parseInt((String) info.get(i).get(j));
		someFees[j - 1] = data;
	}
	
	thisIsIt[i] = new Property(names[i], types[i], price, someFees);
	break;
	
	
case "Railroad": 	
	int price2 = Integer.parseInt((String) info.get(i).get(0));
	int[] someFees2 = new int[4];
	for(int j = 1; j < info.get(i).size(); j++) {
		int data = Integer.parseInt((String) info.get(i).get(j));
		someFees2[j - 1] = data;
	}
	
	thisIsIt[i] = new Railroad(names[i], types[i], price2, someFees2);
	break;
	
	
case "Income_Tax": 
	
	int[] someFees3 = new int[2];
	for(int j = 0; j < info.get(i).size(); j++) {
		int data = Integer.parseInt((String) info.get(i).get(j));
		someFees3[j] = data;
	}
	
	thisIsIt[i] = new Income_Tax(names[i], types[i], someFees3);
	break;
	
case "Luxury_Tax": 
	int[] someFees4 = new int[1];
	for(int j = 0; j < info.get(i).size(); j++) {
		int data = Integer.parseInt((String) info.get(i).get(j));
		someFees4[j] = data;
	}
	
	thisIsIt[i] = new Luxury_Tax(names[i], types[i], someFees4);
	break;
	
case "Luck": 
	thisIsIt[i] = new Luck(names[i], types[i]);
	break;
	
case "Jail": 
	thisIsIt[i] = new Jail(names[i], types[i]);
	break;
	
case "Free_Parking": 
	thisIsIt[i] = new Free_Parking(names[i], types[i]);
	break;
	
case "Go_To_Jail": 
	thisIsIt[i] = new Go_To_Jail(names[i], types[i]);
	break;
	
case "Go": 
	thisIsIt[i] = new Go(names[i], types[i]);
	break;
	
case "Utility": 
	int price5 = Integer.parseInt((String) info.get(i).get(0));
	int[] someFees5 = new int[1];
	for(int j = 1; j < info.get(i).size(); j++) {
		int data = Integer.parseInt((String) info.get(i).get(j));
		someFees5[j - 1] = data;
	}
	
	thisIsIt[i] = new Utility(names[i], types[i], price5, someFees5);
	break;
	default:
		System.out.println("Something's wrong with the file.");
	
}
}
        return thisIsIt;
		
	}
}
