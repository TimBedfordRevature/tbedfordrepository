package labs2;

public class RreturnTypes {
	
	public static void main(String[] args) {
		
		RreturnTypes rt = new RreturnTypes();
		
		rt.returnNothing();
		
		boolean b = rt.returnBoolean();
		
		System.out.println("The value of b is: " + b);
		
	}
	
	public void returnNothing() {
		System.out.println("Inside of a void method");
	}
	
	public boolean returnBoolean() {
		return true;
	}

}
