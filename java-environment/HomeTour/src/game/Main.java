package game;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		RoomManager rm = new RoomManager();
		rm.init();

		Player p = new Player();
		p.setCurrentRoom(rm.getStartingRoom());

		//parse(collectInput(), p);
		printRoom(p);
		
	}

	private static void printRoom(Player player) {
		System.out.println(player.getCurrentRoom());

	}

	private static String[] collectInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] words = input.split(" ");

		//		for(String w : words) {
		//			System.out.println(w);
		//		}

		return words;

	}

	private static void parse(String[] command, Player player) {
		String action = command[0];
		String target = command[1];
		


	}
}
