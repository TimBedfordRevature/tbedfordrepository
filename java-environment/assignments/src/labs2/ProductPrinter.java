package labs2;

public class ProductPrinter {
	
	public static void main(String[] args) {
		
		int[] arr1 = {2,4,6,8,10,12,14,16,18,20};
        int[] arr2 = {1,2,3,5,7,9,11,13,17,19};
        int product;
        
        for(int i = 0; i < arr1.length; i++) {
        	for(int j = 0; j < arr2.length; j++) {
        		product = arr1[i] * arr2[j];
        		System.out.println(product);
        	}
        }
	}

}
