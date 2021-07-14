package flowcontrol;

public class IfStatement {

	public static void main(String[] args) {
		
		System.out.println("Start of application");
		int x = 5;
		if(x < 0) {
			System.out.println("The condition was true!");
			System.out.println("we execute all the code associated with an if-statement");
		}
		System.out.println("End of application");
		
		
		int age = 16;
		boolean withParent = false;
		
		if(age >= 18 || (age >= 13 && withParent)) {
			System.out.println("You can watch rated R movies");
		}
		else {
			System.out.println("You can watch rated G movies");
		}
		}
	}

