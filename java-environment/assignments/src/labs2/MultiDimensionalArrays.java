package labs2;

public class MultiDimensionalArrays {
	
	public static void main(String[] args) {
		
		int [][][] my3dArr = new int [3][3][3];
		
		my3dArr[0][0][0] = 1;
		System.out.println(my3dArr[0][0][0]);
		
		int [][] my2darr = {{1,2,3}, {4,5,6}, {7,8,9}};
		System.out.println(my2darr.length);
		System.out.println(my2darr[1][2]);
	}

}
