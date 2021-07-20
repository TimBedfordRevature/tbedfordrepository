package machines;

public class Car extends Vehicle {
	public String make;
	public int year;
	
	public Car() {} 
	
	public Car(int passengerCount, String engineSize, String model, String type, String make) {
		super(passengerCount, engineSize, model, type);
		this.make = make;
		this.year = year;
	}
	public void honkHorn() {
		System.out.println("Honk Honk");
	}

	public Car(int passengerCount, String engineSize, String model, String type) {
		super(passengerCount, engineSize, model, type);
		// TODO Auto-generated constructor stub
	}

}
