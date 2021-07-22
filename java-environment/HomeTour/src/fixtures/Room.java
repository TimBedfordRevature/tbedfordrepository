package fixtures;

import java.util.HashMap;
import java.util.Map;

public class Room extends Fixture {

	protected HashMap<String, Room> exits = new HashMap<>();


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





	//	public void setExits(Room[] exits) {
	//		this.exits = exits;
	//	}
	//
	//		
	//	public Room[] getExits() {
	//		return exits;
	//		
	//	}
	//		
	//	public Room getExit(String direction) {
	//		
	//		if(direction == "north") {
	//			return exits[1];
	//		}
	//		else if(direction == "south") {
	//			return exits[2];
	//		}
	//		else if(direction == "west") {
	//			return exits[3];
	//		}
	//		else if(direction == "east") {
	//			return exits[4];
	//		}
	//		else {
	//			return exits[0];
	//		}
	//		
	//	}
	//
	////	public static void main(String[] args) {
	////		Fixture fix = new Room("Living Room", "Family gathering room", "Open room with some couches, a rug, and a TV");
	////		System.out.println(fix.name);
	////		System.out.println(fix.shortDescription);
	////		System.out.println(fix.longDescription);
	////	}

}
