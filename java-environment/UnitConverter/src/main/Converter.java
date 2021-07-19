package main;

import java.util.Scanner;

public class Converter {
	
	public static int tsp;
	public static int oz;
	public static int ft;
	public static double cm;
	public static Scanner scan = new Scanner(System.in);
	public static int menuSelection = 0;

	public static void main(String[] args) {

		while(menuSelection != 3) {
			//main menu
			System.out.println("Please select an option (enter number):" + "\n1. Volume conversions" + "\n2. Distance conversions" + "\n3. Quit");
			menuSelection = scan.nextInt();

			switch(menuSelection) {
			case 1 : {
				System.out.println("\nVOLUME - Please select an option:" + "\n1. Tablespoons to Teaspoons" + "\n2. Cups to Ounces" + "\n3. back");
				menuSelection = scan.nextInt();

				//tablespoon-teaspoon conversion
				if(menuSelection == 1) {
					System.out.println("\nEnter number of Tablespoons: ");
					tsp = tablespoonsToTeaspoon(scan.nextInt());
					System.out.println(tsp + " tsp\n");
					//return;
				}

				//cups to ounces conversion
				if(menuSelection == 2) {
					System.out.println("\nEnter number of Cups: ");
					oz = cupsToOunces(scan.nextInt());
					System.out.println(oz + " oz.\n");
				}

				else {
					break;
				}
				break;
			}

			case 2 : {
				System.out.println("\nDISTANCE - Please select an option:" + "\n1. Miles to Feet" + "\n2. Inches to Centimeters" + "\n3. back");
				menuSelection = scan.nextInt();

				if(menuSelection == 1) {
					System.out.println("\nEnter number of miles: ");
					ft = milesToFeet(scan.nextInt());
					System.out.println(ft + " ft\n");
				}

				if(menuSelection == 2) {
					System.out.println("\nEnter number of inches: ");
					cm = inchesToCentimeters(scan.nextInt());
					System.out.println(cm + " cm\n");
				}

				else {
					break;
				}
				break;
			}

			case 3 : {
				System.out.println("\nThank you for using UnitConverter! Goodbye");
				break;	
			}
			}
		}
		scan.close();
	}


	public static int cupsToOunces(int c) {
		return (c * 8);
	}

	public static int tablespoonsToTeaspoon(int t) {
		return (t * 3);
	}

	public static int milesToFeet(int m) {
		return (m * 5280);
	}

	public static double inchesToCentimeters(int i) {
		return (i * 2.54);
	}
}
