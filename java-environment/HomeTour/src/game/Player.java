package game;


import fixtures.Room;

public class Player extends Room {

	public Room currentRoom;
	
	public Player(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}

	public Player() {}


	public Room getCurrentRoom() {
		return this.currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}


}
