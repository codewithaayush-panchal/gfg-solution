public static int recurSum(int n){
      if (n == 1) {
      	return 1;
      }
      return n + recurSum(n-1);
    }

    public static void main(String args[]){
        int n = 10;
        System.out.println(recurSum(n));
    }
