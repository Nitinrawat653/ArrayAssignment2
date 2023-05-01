public class MergeSort {

	public static void main(String[] args) 
	{
		int arr[]= {2,8,1,6,7,4,9};
		
		
		sorted(arr,0,arr.length-1);
		System.out.println("Sorted Elements are");
		for(int element:arr)
		{
			System.out.print(element+" ");
		}
	

	}
	
	public static void sorted(int nums[],int start,int end)
	{
		if(start>=end)
		{
			return;
		}
		
		int mid =start+(end-start)/2;
		sorted(nums,start,mid);
		sorted(nums,mid+1,end);
		merge(nums,start,mid,end);
	}
	public static void merge(int nums[],int start,int mid,int end)
	{
		int merge[]= new int[end-start+1];
		int index1=start;
		int index2=mid+1;
		int x=0;
		
		while(index1<=mid && index2<=end)
		{
			if(nums[index1]<=nums[index2])
			{
				merge[x++]=nums[index1++];
			}
			else
			{
				merge[x++]=nums[index2++];
			}
			
		}
		
		while(index1<=mid)
		{
			merge[x++]=nums[index1++];
		}
		
		while(index2<=end)
		{
			merge[x++]=nums[index2++];
		}
		for(int i=0,j=start;i<merge.length;i++,j++)
		{		
			nums[j]=merge[i];
		}
	}
	

}

