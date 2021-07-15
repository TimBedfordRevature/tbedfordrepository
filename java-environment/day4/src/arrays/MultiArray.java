package arrays;

public class MultiArray {
	
	public static void main(String[] args) {
		
		int [][] num = new int[3][5];
		
		num = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		System.out.println(num[1][2]);
		
		int[][][] coordinates = new int[][][] {{{1,2,3},{1,2,3}, {1,2,3}}, 
												{{4,5,6},{4,5,6},{4,5,6}}, 
												{{7,8,9,},{7,8,9},{7,8,9}}
												};
	}

}
