package constructors;

public class Simulator {
	
	public static void main(String[] args) {
		Dog scooby = new Dog("Scooby Doo", "Great Dane", 7, 100.00);
		System.out.println(scooby.name);
		System.out.println(scooby.breed);
		System.out.println(scooby.age);
		System.out.println(scooby.weight);
		
		Dog scoob = new Dog(7);
		System.out.println(scoob.age);
		System.out.println(scoob.name);
		System.out.println(scoob.breed);
	}

}
