package arrays;
/* Arrays are a fixed-in-length data structure that allow 
 * you to store multiple pieces of the same datatype.
 */

public class Basics {
	
	public static void main(String[] args) {
		
		// 3 different ways to create an array
		int [] num1 = new int[5];
		
		int [] num2 = new int[] {4,7,0,12,77};
		
		/* anonymous array assignment. does NOT declare the datatype. 
		 * the datatype can be inferred due to the declaration of our reference variable.
		 * 
		 * You can ONLY assign an anonymous array to 
		 * a reference variable, when you declare 
		 * the reference variable in the same line!
		 */
		int[] num3 = {5,66,80,23,6};
		
		System.out.println(num3[0]);
		//****************************************************************
		
		//casting values on arrays. can ONLY do on individual values.
		double [] doubles = new double[] {1.0,2.0,3.0,4.0};
		num3[0] = (int)doubles[2];
		System.out.println(num3[0]);
		
		// assigns values from num3 to num4
		int [] num4 = num3;
		System.out.println(num4[0]);
		
	}

}
