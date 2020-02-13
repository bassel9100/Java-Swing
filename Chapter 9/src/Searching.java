public class Searching {

    public static int binarySearch(int[] arr, int x){
        int first = 0;
        int last = arr.length-1;
        int middle = 0;

        while(first <= last){
             middle = (first+last)/2;
            if(x == arr[middle])
                break;
            else if(x > arr[middle]){
                first = middle + 1;
            } else if (x < arr[middle]) {
                last = middle - 1;
            }
        }
        if(x == arr[middle])
            return middle;
        else
            return -1;
    }
}
