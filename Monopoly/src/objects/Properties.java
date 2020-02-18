package objects;

public abstract class Properties extends spaces {
	protected int cost;
	protected int multiplier;
	protected int fee;
	protected boolean ownAll;
	
	protected abstract void charge();
}
