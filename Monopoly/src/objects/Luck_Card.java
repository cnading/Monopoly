package objects;
import program.*;
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
	
	
	public void theAction(boolean chestNotChance) {
		if(chestNotChance) {
		Data.chestCardMethods.get(placeInList).theMethod(Data.players.get(Data.turn));
		}
		else {
		Data.chanceCardMethods.get(placeInList).theMethod(Data.players.get(Data.turn));	
		}
	}
	
	public static Luck_Card drawCard(boolean chestNoChance) {
		
		if(chestNoChance) {
			
			for(Luck_Card lc : Data.chestStack) {
				if(lc.isActive()) {
					lc.setActive(false);
					return lc;
				}
			}
			for(Luck_Card lc : Data.chestStack) {
				lc.setActive(true);
			}
			drawCard(chestNoChance);
		}
		else {
			for(Luck_Card lc : Data.chanceStack) {
				if(lc.isActive()) {
					lc.setActive(false);
					return lc;
				}
			}
			for(Luck_Card lc : Data.chanceStack) {
				lc.setActive(true);
			}
			drawCard(chestNoChance);

		}
		return null;
		
	}
	
	
	
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
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
