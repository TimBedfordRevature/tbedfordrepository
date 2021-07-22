package game;

import fixtures.Room;
import java.util.ArrayList;



public class RoomManager extends Room {

	public Room startingRoom;
	static ArrayList<Room> rooms = new ArrayList<Room>();

	public void init() {

		Room livingRoom = new Room("Living Room", "Family gathering room", "Open room with some couches, a rug, and a TV");
		rooms.add(livingRoom);
		setStartingRoom(livingRoom);

		Room kitchen = new Room("Kitchen", "Food preperation and consumption room", "Room filled with cooking appliances and food");
		rooms.add(kitchen);
		livingRoom.setExits("north", kitchen);
		kitchen.setExits("south", livingRoom);

	}

	public Room getStartingRoom() {
		return this.startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
}
