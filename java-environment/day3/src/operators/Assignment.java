package operators;

public class Assignment {
	
	public static void main(String[] args) {
		
		int x = 100;
		System.out.println(x = 15);
		System.out.println(x);
		
		boolean run = false;
		
		// Be wary! below does NOT check the value of boolean 'run', it CHANGES its value to true
		// to do comparison you must use double equal sign "==" 
		// '=' -> assignment
		// "==" -> comparison
		if(run = true) {
			System.out.println("I ran!");
			}
		else {
			System.out.println("I did not run");
			}
		}
	}

