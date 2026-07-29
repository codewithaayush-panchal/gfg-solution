public static void main(String args[])
    {
        String str = "geeksforgeeKs";
      	char c = upperCase(str, 0);
      	if (c == 0) {
        	System.out.println("No uppercase letter found in string");
        }	else {
      		System.out.println(c);
        }
    }
  
  	static char upperCase(String str, int i) {
    	if (i == str.length()) {
        	return 0;
        }
      	if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        	return str.charAt(i);
        }
      	return upperCase(str, i+1);
    }
