package game;

import fixtures.Room;

public class RoomManager extends Room {
	
	public Room startingRoom;
	public Room[] rooms;
	
	public RoomManager() {
		super();
		this.startingRoom = startingRoom;
		this.rooms = rooms;
	}

	public void init() {
	    Room foyer = new Room(
			"The Foyer",
			"a small foyer",
			"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the north is a small room, where you can see a piano.");
			this.rooms[0] = foyer;
	        this.startingRoom = rooms[0];
	        
	    Room livingRoom = new Room("Living Room", "Family gathering room", "Open room with some couches, a rug, and a TV");
	    this.rooms[1] = livingRoom; 
	}
	
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = rooms[0];
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	public Room[] getRooms() {
		return this.rooms;
	}

}
