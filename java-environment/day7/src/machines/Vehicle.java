package machines;

public class Vehicle {
	public int passengerCount;
	public String engineSize;
	public String model;
	public String type;
	
	
	public Vehicle() {} //default constructor
	
	public Vehicle(int passengerCount, String engineSize, String model, String type) {
		super();
		this.passengerCount = passengerCount;
		this.engineSize = engineSize;
		this.model = model;
		this.type = type;
	}

	public void drive() {
		System.out.println("Vroom Vroom");
	}
	
	public void start() {
		System.out.println("Starting the Engine");
	}
	
	public void brake() {
		System.out.println("Slowing down...");
	}

}
