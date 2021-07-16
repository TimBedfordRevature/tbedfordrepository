package strings;

public class Simulator {
	
	public static void main(String[] args) {
		
		String one = "Revature";
		String two = new String("Revature");
		String three = "Revature";
		
		System.out.println(one);
		System.out.println(two);
		
		/*
		 * the '==' operator compares the memory addressess
		 * when creating Strings, string literals are
		 * placed in the string pool, while other String
		 * objects are placed in the 'normal' heap area
		 */
		System.out.println("== : " + (one == two)); // false. comparing memory addresses
		System.out.println("equals : " + one.equals(two)); // true. comparing information on the objects itself
		System.out.println(one == three); // true. they share the same memory address
		
		System.out.println(one.hashCode()); //provides unique value for our object
	}

}
