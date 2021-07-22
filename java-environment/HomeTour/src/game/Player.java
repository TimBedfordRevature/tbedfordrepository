package game;

import fixtures.Fixture;
import fixtures.Room;

public class Player extends Fixture {

	public Player(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		// TODO Auto-generated constructor stub
	}

	public Player() {}

	public Room currentRoom;

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}


}
