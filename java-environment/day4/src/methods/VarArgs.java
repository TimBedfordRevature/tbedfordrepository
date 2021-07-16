package methods;

public class VarArgs {
	
	public static void main(String[] args) {
		
		VarArgs va = new VarArgs();
		String[] sentences = new String[] {"Hello", "Goodbye"};
		va.takeArray(sentences);
		
		va.takeVarArgs("Hello", "Goodbye");
		
	}
	
	
	public void takeArray(String [] words) {
		
		for(String w : words) {
			System.out.println(w);
		}
	}
	
	public void takeVarArgs(String... words) {
		for(String w : words) {
			System.out.println(w);
		}
	}

}
