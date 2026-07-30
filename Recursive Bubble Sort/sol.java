public class GFG 
{
    // A function to implement bubble sort
    static void bubbleSort(int[] arr, int size) {
      if (size == 1) {
      	return;
      }
      
      for (int i = 1; i < size; i++) {
      	if (arr[i] < arr[i-1]) {
        	int temp = arr[i];
          	arr[i] = arr[i-1];
          	arr[i-1] = temp;
        }
      }
      
      bubbleSort(arr, size-1);
      
    }
    
    // Driver Method
    public static void main(String[] args)
    {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
     	bubbleSort(arr, arr.length);
      	System.out.println(Arrays.toString(arr));
        
    }
}
