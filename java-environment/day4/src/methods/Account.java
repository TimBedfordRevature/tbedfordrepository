package methods;

public class Account {
	public double total;
	
	public double deposit(double amount) {
		
		System.out.println("You deposited: $" + amount);
		total += amount;
		System.out.println("Your new total is: $" + total);
		
		return total;
	}
}
