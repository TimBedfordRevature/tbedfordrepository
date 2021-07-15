package loops;

public class WhileLoops {
	
	public static void main(String[] args) {
		
		System.out.println("START OF APPLICATION");
		
		char letter = 'a';
		
		while(letter <= 'z') {
			System.out.print(letter);
			
			if(letter == 'j')
				break;
			
			letter++;
		}
		
		
		System.out.println("\nEND OF APPLICATION");
	}

}
