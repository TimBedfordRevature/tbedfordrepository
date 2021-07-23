package fixtures;

import java.util.ArrayList;
import java.util.HashMap;

public class Room extends Fixture {

	protected HashMap<String, Room> exits = new HashMap<>();
	protected ArrayList<Items> items = new ArrayList<Items>();

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}

	public Room() {}


	public void setExits(String direction, Room room) {
		exits.put(direction, room);
	}

	public HashMap<String, Room> getExits(){
		return exits;
	}

	public Room getExit(String direction) {
		return exits.get(direction);
	}

	public void addItem(Items item) {
		items.add(item);
	}

	public ArrayList<Items> getItems(){
		return items;
	}

}
