package game;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import fixtures.Room;

public class Main {

	public static void main(String[] args) {
		boolean running = true;
		RoomManager rm = new RoomManager();
		rm.init();
		Player p = new Player();
		p.setCurrentRoom(rm.getStartingRoom());

		
		while(running) {
			printRoom(p);
			printExits(p);
			String [] command = collectInput();
			parse(command, p);

		}
	}

	private static void printRoom(Player player) {

		System.out.println("Room: " + player.getCurrentRoom().name);
		System.out.println("Short Desc: " + player.getCurrentRoom().shortDescription);
		System.out.println("Long Desc: " + player.getCurrentRoom().longDescription);
	}

	private static String[] collectInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().toLowerCase();
		String[] words = input.split(" ");

		return words;
	}

	public static void printExits(Player player) {
		Room currentRoom = player.getCurrentRoom();
		Map<String,Room> exits = currentRoom.getExits();
		for(Map.Entry<String, Room> exit : exits.entrySet()){
			System.out.println("Doorway " + exit.getKey() + " > " + exit.getValue().getName());
		}
	}

	private static void parse(String[] command, Player player) {
		String action = command[0];
		String target = command[1];

		switch(action) {

		case "go" : {
			if(target == "north") {
				player.setCurrentRoom(player.getCurrentRoom().getExit(target));
			}
		}
		break;

		}
	}
}
