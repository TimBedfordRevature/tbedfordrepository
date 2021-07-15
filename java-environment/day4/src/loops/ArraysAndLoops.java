package loops;

public class ArraysAndLoops {

	public static void main(String[] args) {

		char[] letters = {'a','b','c','d','e','f'};

		for(int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}

		//advanced for-loop
		for(int L : letters) {
			System.out.println(L);
		}

		//advanced for-loop using char
		for(char L : letters) {
			System.out.println(L + ":" + (int)L);
		}
	}

}
