/ Recursive function to sort an array using
    // insertion sort
    
  static void insertionSortRecursive(int[] arr, int len) {
  	
    if (len == 1) {
    	return;
    }
    
    for (int i = 1; i < len; i++) {
    	if (arr[i] < arr[i-1]) {
        	int temp = arr[i];
          	arr[i] = arr[i-1];
          	arr[i-1] = temp;
        }
    }
    
    insertionSortRecursive(arr, len-1);
    
  }
    
    // Driver Method
    public static void main(String[] args)
    {
        int arr[] = {12, 11, 13, 5, 6};
     
        insertionSortRecursive(arr, arr.length);
        
        System.out.println(Arrays.toString(arr));
    }
