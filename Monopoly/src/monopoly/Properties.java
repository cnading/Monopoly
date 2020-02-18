package monopoly;


public abstract class Properties extends Space {
	protected int cost;
	protected int multiplier;
	protected int fee;
	protected boolean ownAll;
	
	protected abstract void charge();
}
