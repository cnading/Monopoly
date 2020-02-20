package objects;

public class Income_Tax extends Space{

protected int[] fees;



	public Income_Tax(String theName, String theType, int[] theFees) {
		type = theType;
		name = theName;
	fees = theFees;
		
		
		
	}

	public int[] getFees() {
		return fees;
	}
	public int getFeeToPlayer() {
return 0;
	}

	public void setFees(int[] fees) {
		this.fees = fees;
	}


	public void action() {
		
		
	}


	
	

}
