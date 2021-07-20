package machines;

public class Plane extends Vehicle {
	
	public Plane() {}
	
	public Plane(int passengerCount, String engineSize, String model, String type) {
		super(passengerCount, engineSize, model, type);
	}
	public void fly() {
		System.out.println("Flying through the air");
	}

}
