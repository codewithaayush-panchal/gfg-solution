static int sum_of_digit(int num) {
      
      	if (num == 0) {
        	return 0;
        }
      
    	int sum = 0;
      	sum = num%10 + sum_of_digit(num/10);
      
      	return sum;
      
     	
    }

    // Driven Program to check above
    public static void main(String args[])
    {
        int num = 8734;
        int result = sum_of_digit(num);
        System.out.println(result);
    }
