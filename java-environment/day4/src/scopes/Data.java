package scopes;

public class Data {
	
	public static void main(String[] args) {
		
		/*
		 * scopes dictate where and for how long, we have access
		 * to variables that have created.
		 */
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		for(int i = 10; i > 5; i--) {
			System.out.println(i);
		}
	}
	
	public static void variable() {
		int i = 100;
	}

}
