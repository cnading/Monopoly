package objects;

public class Luck_Card {
private String name;
private boolean chestNotChance;
private int placeInList;
private boolean active;
	public Luck_Card(String theName, boolean chest, int thePlaceInList) {
name = theName;
chestNotChance = chest;
placeInList = thePlaceInList;
active = true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isChestNotChance() {
		return chestNotChance;
	}
	public void setChestNotChance(boolean chestNotChance) {
		this.chestNotChance = chestNotChance;
	}
	public int getPlaceInList() {
		return placeInList;
	}
	public void setPlaceInList(int placeInList) {
		this.placeInList = placeInList;
	}
	
}
