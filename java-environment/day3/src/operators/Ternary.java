package operators;

public class Ternary {
	public static void main(String[] args) {
		
		int a = true ? 15 : 99; // 15 assigned
		int b = false ? 15 : 99; // 99 assigned
		
		String result = a > b ? "A was larger" : "B was larger";
		System.out.println(result);
		
	}
}
