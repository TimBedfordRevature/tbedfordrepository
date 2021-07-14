package operators;
 // ctrl + space -> opens context menu which supplies suggestions based off what you have typed out.
public class Unary {
	
	public static void main(String[] args) {
		
		int post = 10;
		System.out.println(post); // prints 10
		System.out.println(post++); // prints 10 then increases post (10) by 1
		System.out.println(post); // now prints 11
		System.out.println("\nPOST: \nBefore: " + post++ + ", After: " + post);
		
		int pre = 10;
		System.out.println(pre); // prints 10
		System.out.println(++pre); // increases pre (10) by 1 then prints
		System.out.println("\nPRE: \nBefore: " + pre + ", After: " + ++pre);
	}
}
