package operators;

/*
 * Logical operators are a set of boolean operators that
 * compare two boolean balues/operands. based on the value
 * of those boolean operands, the logical operator will return 
 * either true or false.
 */
public class LogicalOperators {
	public static void main(String[] args) {
		/*
		 * AND operators will return false unless both operands are true
		 */
		System.out.println(true & true); // true
		System.out.println(true & false); // false
		
		// OR operators will return true unless both are false
		
		System.out.println(true | true); // true
		System.out.println(true | false); // true
		System.out.println(false | false); // false
		
		System.out.println("\nSHORTCIRCUIT:");
		System.out.println(printAndReturnFalse() & printAndReturnTrue());
		System.out.println(printAndReturnFalse() && printAndReturnTrue());
		
		System.out.println("\nSHORTCIRCUIT [OR]:");
		System.out.println(printAndReturnTrue() | printAndReturnFalse());
		System.out.println(printAndReturnTrue() || printAndReturnFalse());
		
		boolean t = true;
		boolean f = false;
		System.out.println("\nBOOL: " + (t & f));
	}
	
	public static boolean printAndReturnTrue() {
		System.out.println("This method will return True!");
		return true;
	}
	
	public static boolean printAndReturnFalse() {
		System.out.println("This method will return False!");
		return false;
	}

}
