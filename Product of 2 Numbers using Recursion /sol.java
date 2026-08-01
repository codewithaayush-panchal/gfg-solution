static int product(int x, int y)
    {
      
      if (x == 0 || y == 0) {
      	return 0;
      }
      
      int product = 0;
      
      if (x < y) {
      	product = y + product(y, x-1);
      }	else {
      	product = x + product(x, y-1);
      }
      
      return product;
      
    }
    
    public static void main (String[] args)
    {
        int x = 20, y = 4;
        System.out.println(product(x, y)); 
    }
