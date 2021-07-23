package game;

import java.util.Map;
import java.util.Scanner;

import fixtures.Items;
import fixtures.Room;

public class Main {

	public static boolean running = true;

	public static void main(String[] args) {

		System.out.println("Commands: \nMove to new room - 'go' + direction (EX: go north)" + "\nInteract with item - 'inspect item'" + "\nTo leave tour enter - exit tour\n");

		RoomManager rm = new RoomManager();
		rm.init();
		Player p = new Player();
		p.setCurrentRoom(rm.getStartingRoom());
		Scanner scan = new Scanner(System.in);


		while(running) {
			printRoom(p);
			printExits(p);
			printRoomItems(p);
			String input = scan.nextLine().toLowerCase();
			String [] command = collectInput(input);
			parse(command, p);
		}

		System.out.println("Goodbye");
		scan.close();
	}

	private static void printRoom(Player player) {

		System.out.println("Room: " + player.getCurrentRoom().name);
		System.out.println("Short Desc: " + player.getCurrentRoom().shortDescription);
		System.out.println("Long Desc: " + player.getCurrentRoom().longDescription);
	}

	public static void printRoomItems(Player p) {
		int size = p.getCurrentRoom().getItems().size();
		for(int i = 0; i < size; i++) {
			Items item = p.getCurrentRoom().getItems().get(i);
			System.out.println("Items in Room: " + item.getName());
		}
	}

	private static String[] collectInput(String s) {
		String[] words = s.split(" ");

		return words;
	}

	public static void printExits(Player player) {
		Room currentRoom = player.getCurrentRoom();
		Map<String,Room> exits = currentRoom.getExits();
		for(Map.Entry<String, Room> exit : exits.entrySet()){
			System.out.println("* Doorway " + exit.getKey() + " > " + exit.getValue().getName());
		}
	}

	public static void itemDescription(Player p) {
		System.out.println("\n" + p.getCurrentRoom().getItems().toString() + "\n");
	}

	private static void parse(String[] command, Player p) {
		String action = command[0];
		String target = command[1];

		switch(action) {

		case "go" : {
			if(target.equals("north")) {
				p.setCurrentRoom(p.getCurrentRoom().getExit(target));
			}
			if(target.equals("south")) {
				p.setCurrentRoom(p.getCurrentRoom().getExit(target));
			}
			if(target.equals("east")) {
				p.setCurrentRoom(p.getCurrentRoom().getExit(target));
			}
			if(target.equals("west")) {
				p.setCurrentRoom(p.getCurrentRoom().getExit(target));
			}
			//			if(target.equals(null)) {
			//				System.out.println("Invalid input: must enter a direction");
			//			}
		}
		break;
		case "exit" : {
			if(target.equals("tour")) {
				running = false;
			}
		}
		break;

		case "inspect" : {
			if(target.equals("item")) {
				itemDescription(p);
			}
		}

		}
	}
}
