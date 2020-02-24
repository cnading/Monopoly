package objects;

public class Jail extends Space{




	public Jail(String theName, String theType, int thePos) {
		type = theType;
		name = theName;
		position = thePos;
		
		
		
	}

	public void action() {
		System.out.println("Don't worry, you're just visiting.");
		
	}


	
	

}
