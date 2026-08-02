static boolean isPrime(int n, int i)
    {
		if (i == n) {
        	return true;
        }
      
      	if (n % i == 0) {
        	return false;
        }
      
      	return isPrime(n, i+1);
      
    }
    
    // Driver program to test above function 
    public static void main(String[] args)
    {

        int n = 7;

        if (isPrime(n, 2)) 
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
