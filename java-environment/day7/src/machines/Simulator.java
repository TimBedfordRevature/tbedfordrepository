package machines;

public class Simulator {
	
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		v.start();
		
		Car c = new Car();
		c.start();
		c.drive();
		c.honkHorn();
		
		Plane p = new Plane();
		p.start();
		p.fly();
	}

}
