import java.util.*;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int temp=0;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter size of array");
		
		int size =scan.nextInt();
		int array[]= new int[size];
		System.out.println("Enter element to sort");
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=scan.nextInt();
		}
	
		for(int i=0;i<array.length;i++)
		{
			for(int j=1;j<array.length-i;j++)
			{
				if(array[j]<array[j-1])
				{
				    temp=array[j];
				    array[j]=array[j-1];
				    array[j-1]=temp;
				    		
				}
			}
		}
		System.out.println("Sorted Elements are");
		for(int element:array)
		{
			System.out.print(element+" ");
		}
		
	}

}