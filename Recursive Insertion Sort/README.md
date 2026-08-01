nsertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
Below is an iterative algorithm for insertion sort
Algorithm 

// Sort an arr[] of size n
insertionSort(arr, n) 
    Loop from i = 1 to n-1.
       a) Pick element arr[i] and insert
          it into sorted sequence arr[0..i-1] 
