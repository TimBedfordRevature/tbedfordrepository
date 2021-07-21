package exceptions;

public class Simulator {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(sumOddNumbers(5, 4));
		} catch (EvenNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception ex) {
			ex.printStackTrace();
		} 
	}
	
	public static int sumOddNumbers(int a, int b) throws EvenNumberException {
		
		if(a % 2 == 0) {
			throw new EvenNumberException("First Input was Even");
		}
		else if(b % 2 == 0) {
			throw new EvenNumberException("Second Input was Even");
		}
		
		return a + b;
	}

}
