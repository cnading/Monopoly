package monopoly;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Input_File {
	public static String[] readFile(String fileName) throws Exception{
		
		Scanner StringInput = new Scanner(System.in);

		System.out.println("Input test:");
		
		String theInput = StringInput.nextLine();

        // The name of the file to open.

String[] names = new String[40];
        // This will reference one line at a time


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
            names[counter] = line.split(" ")[1];
counter++;
            // Always close files.
            bufferedReader.close();			
        	}
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
        return names;
		
	}
}
