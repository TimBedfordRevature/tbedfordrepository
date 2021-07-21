package fixtures;

public class Room extends Fixture {
	
	public Room [] exits;
	

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[1]; // size is your choice
	}
	
	public Room() {}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

		
	public Room[] getExits() {
		return exits;
		
	}
		
	public Room getExit(String direction) {
		return null;
		
	}

//	public static void main(String[] args) {
//		Fixture fix = new Room("Living Room", "Family gathering room", "Open room with some couches, a rug, and a TV");
//		System.out.println(fix.name);
//		System.out.println(fix.shortDescription);
//		System.out.println(fix.longDescription);
//	}

}
