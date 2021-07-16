package constructors;

public class Dog {
	public String name;
	public String breed;
	public int age;
	public double weight;
	RepositoryCommunication rc = new RepositoryCommunication();
	//rc.passToRepo(this);
	
	
	public void bark() {
		System.out.println("Woof Woof!");
	}
	
	//default constructor
	/*
	 * public Dog() { }
	 */
	
	//custom constructor
	//when you define a custom constructor java will NOT provide a default constructor
	/*
	public Dog(String n, String b, int a, double w) {
		name = n;
		breed = b;
		age = a;
		weight = w;
	}
	*/
		
	public Dog(String name, String breed, int age, double weight) {
		/*
		 * "this" refers to the object in question EX: public String name;
		 */
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
		
	}
	
	/*
	 * Overloaded constructor that only provides a single
	 * string argument for the name
	 */
	public Dog(String n) {
		name = n;
	}
	
	public Dog(double weight) {
		this.weight = weight;
	}

	public Dog(int age) {
		this("No Name Provided", "No Breed Provided", age, 0.0);
	}
	
	/*
	 * cannot have two constructors that take in the same number of the same parameter.
	 * EX: this one would not be able to tell if it is taking in a name or breed
	public Dog(String b) {
		breed = b;
	}
	*/

}
