public ArrayList<Integer> getMinMax(int[] arr) {

        if (arr.length == 1) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(arr[0]);
            list.add(arr[0]);
            return list;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        list.add(arr[0]);
        
        
        min_max(arr, 0, list);
        
        return list;
        
    }
    
    public static void min_max(int[] arr, int index, ArrayList<Integer> list) {
        
        if (index == arr.length) {
            return;
        }
        
        list.set(0, Math.min(list.get(0), arr[index]));
        list.set(1, Math.max(list.get(1), arr[index]));
        
        min_max(arr, index+1, list);
        
    }
