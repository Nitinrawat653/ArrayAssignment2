
public class QuickSort {
	
	static int divide(int array[], int low, int high)
    {
        int pivot = array[high];
        int i = (low - 1); 
        for (int j = low; j <= high - 1; j++) {
            
            if (array[j] <= pivot) {
                i++;
 
                
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
 
        
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
 
        return i + 1;
    }
 
    
    static void qickSort(int arr[], int low, int high)
    {
        if (low < high) {
            
            int pi = divide(arr, low, high);
 
            
            qickSort(arr, low, pi - 1);
            qickSort(arr, pi + 1, high);
        }
    }
 
    
    public static void main(String args[])
    {
 
        // initializing the array
        int arr[] = { 4, 2, 6, 9, 1 };
        
 
        //calling quickSort Method
        qickSort(arr, 0, arr.length - 1);
 
        //printing after quick sort
        System.out.println("Elements after quick sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");
        }
    }
}