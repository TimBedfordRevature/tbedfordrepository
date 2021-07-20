package overloadingPref;

public class Simulator {

	public static void main(String[] args) {
		method(5);
	}
	
	public static void method(int i) {
		System.out.println("Int: " + i);
	}
	
	public static void method(long l) {
		System.out.println("Long: " + l);
	}
	
	public static void method(int... var) {
		System.out.println("Var Args: " + var);
	}
}
