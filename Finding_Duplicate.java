import java.util.Arrays;

public class Finding_Duplicate {

	public static void main(String[] args) {

		int[] ar = { 11, 34, 56, 23, 12, 34, 23, 56, 9, 6, 1, 1 };
		for(int k:ar) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println();

		// with sorting

		
		  Arrays.sort(ar); 
		  for(int i:ar) { 
			  System.out.print(i+" "); 
			  }
		  System.out.println();
		  
		  for(int j=1;j<ar.length;j++) { 
			  if(ar[j-1]==ar[j]) {
				  System.out.println(ar[j-1]+" at "+(j-1)+ " is same as "+ar[j]+ " at "+ j); 
				  }
		  }
		  System.out.println();
		 

		// without sorting

		int[] arr = { 11, 34, 56, 23, 12, 34, 23, 56, 9, 6, 11, 11};

		for (int i = 0; i < arr.length; i++) {
			for (int j = (i + 1); j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i] + " at " + i + " is same as " + arr[j] + " at " + j);
				}
			}
		}
	}

}
