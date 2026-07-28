public static void printTriangle(int[] A) {
        int[] b = new int[A.length-1];
        if (b.length == 0) {
            return;
        }
        for (int j = 0; j < b.length; j++) {
            b[j] = A[j]+A[j+1];
        }
        printTriangle(b);
        System.out.println(Arrays.toString(b));
        if (A.length == 5) {
            System.out.println(Arrays.toString(A));
        }
    }

    // Driver function
    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3, 4, 5 };
        printTriangle(A);
    }
