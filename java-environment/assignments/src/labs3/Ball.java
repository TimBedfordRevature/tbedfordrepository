package labs3;

public class Ball {
	
	String size;
	String color;
	
	public static void main(String[] args) {
		
		Ball b1 = new Ball();
		Ball b2 = new Ball();
		
		b1.size = "big";
		b1.color = "red";
		b2.size = "small";
		b2.color = "blue";
		
		//invoke bounce method
		b1.bounce();
		b2.bounce();
	}
	
	public void bounce() {
		System.out.println("The " + size + " " + color + " ball is bouncing.");
	}

}
