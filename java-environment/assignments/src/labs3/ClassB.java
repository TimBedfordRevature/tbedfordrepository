package labs3;

public class ClassB {
	
	ClassA classA = new ClassA();
	
	public static void main(String[] args) {
		
		ClassB b = new ClassB();
		b.classA.setName("Tim");
		
		System.out.println(b.classA.getName());
	}

}
