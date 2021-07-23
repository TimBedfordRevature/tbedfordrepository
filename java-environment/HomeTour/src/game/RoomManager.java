package game;

import fixtures.Items;
import fixtures.Room;
import java.util.ArrayList;



public class RoomManager extends Room {

	public Room startingRoom;
	static ArrayList<Room> rooms = new ArrayList<Room>();

	// method that will be called in the main to initialize all the rooms.
	public void init() {

		// Add all rooms in the house with their name, short and long descriptions
		Items book = new Items("Book","You pick up the book and open it. Its a dictionary...");
		Items tv = new Items("TV", "You turn on the TV. Its playing Looney Tunes...");
		Items fidge = new Items("refrigerator", "You open the fridge. its empty, much like your stomach...");
		Items fineChina = new Items("Fine China", "You approach the shelf but accidentally trip and bump into it, knocking off one of the plates and breaking it...");
		Items bed = new Items("Bed", "You belly flop into the bed, its really comfy...");
		Items toilet = new Items("Toilet", "Nature calls...");

		Room livingRoom = new Room("Living Room", "Family gathering and entertainment room", "Inside is a couch with a coffe table siting in front of it."
				+ "\n	Across from the couch is a wall mounted TV hanging over a gas fireplace. \n	There are also some pictures hanging on the walls.");
		rooms.add(livingRoom);
		setStartingRoom(livingRoom);

		Room kitchen = new Room("Kitchen", "Food storage and preperation room", "Inside is an island countertop with a fruit basket on it." 
				+ "\n	To the left of the island is a doubledoor refrigerator with some family photos stuck to the front with magnets."
				+ "\n	There is also an oven with a mounted microwave overtop of it.");
		rooms.add(kitchen);

		Room diningRoom = new Room("Dining Room", "Room that families dine in", "Inside is a four place table sitting in the center of the room."
				+ "\n	In the corner is a shelf with fragile china on it" + "\n	Hanging above the dining room table is a ornate chandelier.");
		rooms.add(diningRoom);

		Room masterBedroom = new Room("Master Bedroom", "Main bedroom belonging to the home owners", "Inside is a kingsized bed with a darkwoodframe that is sitting against the backwall."
				+ "\n	There is a large dresser directly across the room from \n	the bed with a large mirror mounted on the wall over it.");
		rooms.add(masterBedroom);

		Room bathroom = new Room("Bathroom", "Personal hygiene room", "Inside is a tiled floor with a shower/bath combo and his&hers vanities");
		rooms.add(bathroom);

		Room library = new Room("Library", "Room containing books", "Inside is three large bookcases on the left and far right walls with books of varying subjects"
				+ "\n	In the far right corner is a reading chair with a floor lamp beside it.");
		rooms.add(library);

		// add items to rooms
		library.addItem(book);
		livingRoom.addItem(tv);
		kitchen.addItem(fidge);
		diningRoom.addItem(fineChina);
		masterBedroom.addItem(bed);
		bathroom.addItem(toilet);
		

		// set all exits that are connected to each room
		livingRoom.setExits("north", kitchen);
		livingRoom.setExits("west", masterBedroom);
		livingRoom.setExits("east", library);
		kitchen.setExits("south", livingRoom);
		kitchen.setExits("east", diningRoom);
		diningRoom.setExits("west", kitchen);
		diningRoom.setExits("south", library);
		masterBedroom.setExits("east", livingRoom);
		masterBedroom.setExits("south", bathroom);
		bathroom.setExits("north", masterBedroom);
		library.setExits("west", livingRoom);
		library.setExits("north", diningRoom);

	}

	public Room getStartingRoom() {
		return this.startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}

}
