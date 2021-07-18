package labs3;

import java.util.Scanner;

public class LabScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please type in a line and hit Enter.");
		String line = sc.nextLine();
		
		System.out.println("You typed: " + line);
		
		sc.close();
		
		String numbers = "1 2 3 5 7 9";

		sc = new Scanner(numbers);

        while (sc.hasNextInt()) {
            System.out.print(sc.nextInt());
        }

        sc.close();
	}
}
