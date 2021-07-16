package scanners;

import java.util.Scanner;

public class ScanSimulator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		System.out.println("Your word was: " + word);
		int second = scan.nextInt();
		System.out.println("Your number was: " + second);
	}

}
