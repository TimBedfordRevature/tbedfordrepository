package labs3;

public class Constructors {
	
	public static void main(String[] args) {
		
		Constructors c = new Constructors(5839);
		
		Constructors cNoArg = new Constructors();
		
	}
	
	public Constructors(int value) {
		System.out.println(value);
	}
	
	public Constructors() {
		System.out.println("Default constructor ran.");
	}

}
