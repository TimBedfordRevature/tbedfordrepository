package methods;

public class Simulator {
	
	public static void main(String[] args) {
		Account acc = new Account(); // create a new Account object
		
		acc.deposit(100.00);
		acc.deposit(50.00);
		
		Account acc2 = new Account();
		acc2.deposit(1000.00);
		
		System.out.println(acc.total);
		System.out.println(acc2.total);
		
		acc.deposit("Pay check", 75.00);
	}

}
