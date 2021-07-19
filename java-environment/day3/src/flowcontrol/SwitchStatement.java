package flowcontrol;

/*
 * Switch statements are other conditional statements, like 
 * if-else statements, which can dictate the flow of our
 *  program's execution.
 *  
 *  Switch statements exhibit 'fall-through' logic. this means
 *  that once a match is found for a case, we will continue
 *  to execute logic, until we reach a break statement or the
 */
public class SwitchStatement {
	public static void main(String[] args) {
		
		char letter = 'J';
		
		switch (letter) {
		case 'A' : {
			System.out.println("A is for Assembly");
			break;
		}
		case 'B' :
			System.out.println("B is for Binary");
			break;
		case 'C' :
			System.out.println("C is for Compiled");
			break;
		default:
			System.out.println("No matching letter found");
		}
	}

}
