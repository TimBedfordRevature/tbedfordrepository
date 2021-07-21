package exceptions;

public class FinallyBlock {
	public static void main(String[] args) {
		/*
		 * when you use a try-catch block, note that
		 * you actually do not need a catch statement.
		 * you can use a try-block with a finally statement
		 */
		try {
			recursive(1);
		} catch(StackOverflowError e) {
			e.printStackTrace();
			System.exit(0); //stops execution of program
		} finally {

			System.out.println("FINALLY BLOCK RAN!!!");
		}
	}

	public static void recursive(int a) { //This method will never end and should result in stack-overflow
		recursive(a++);
	}

}
