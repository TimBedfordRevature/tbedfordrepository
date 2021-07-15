package loops;

public class BreakAndContinue {
	
	public static void main(String[] args) {
		
		System.out.println("BREAK:");
		for(char letter = 'a'; letter < 'd'; letter++) {
			for(int i = 0; i < 4; i++) {
				if(i == 2) {
					break;
				}
				System.out.println(letter + ":" + i);
			}
		}
		
		System.out.println("CONTINUE:");
		for(char letter = 'a'; letter < 'd'; letter++) {
			for(int i = 0; i < 4; i++) {
				if(i == 2) {
					continue;
				}
				System.out.println(letter + ":" + i);
			}
		}
		
		/*
		 * A lable is an identifier/moniker, we can apply
		 * to a loop, that allows us to dictate where we
		 * apply the logic for a break or continue statement
		 * Note that the name of the lables are arbitrary...
		 */
		System.out.println("LABLES:");
		alpha: for(char letter = 'a'; letter < 'd'; letter++) {
			numeric: for(int i = 0; i < 4; i++) {
				if(letter == 'b') {
					continue alpha;
				}
				System.out.println(letter + ":" + i);
			}
		}
		
	}

}
