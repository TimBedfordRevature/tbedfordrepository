package labs2;

public class OverloadedMethods {
	
	public static void main(String[] args) {
		
		OverloadedMethods om = new OverloadedMethods();
		
		om.print();
		om.print("Overloaded print method");
		om.print("seccond", "thrid");
		
	}
	
	public void print() {
		System.out.println("Original print method.");
	}
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public void print(String str1, String str2) {
		System.out.println(str1 + " " +  str2);
	}
	
	/*
	public void print(String first, String seccond) {
		System.out.println(first + " " +  first);
	}
	*/

}
