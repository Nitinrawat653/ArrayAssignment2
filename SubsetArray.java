
public class SubsetArray {

	public static void main(String[] args) 
	{
		int arr1[]= {1,2,3,4,5};
		int arr2[] = {2,4,5};
		int k=0;
		int count=0;
		
		for(int i=0;i<arr1.length;i++) 
		{
			if(arr2[k++]==arr1[i])    
			{
				count++;
				
			}
			else
			{
				k=0;
				
			}
			
			if(count==3)
			{
				System.out.print("Yes a Subset of array");
				return;
				
			}
				
		}
		
		System.out.print("Not a subset array");
				
				

	}

}