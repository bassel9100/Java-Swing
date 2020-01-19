public class Methods {

    public static void bubbleSort(int[] arr){
        boolean notSorted = true;
        while(notSorted) {
            notSorted = false;
            for (int i = 0; i < arr.length - 1; i++)
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    notSorted = true;
                }
        }
    }

    public static int linearSearch(int[] arr, int x){
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == x)
                return i;
        return -1;
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            int temp = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[temp])
                    temp = j;
            int x = arr[i];
            arr[i] = arr[temp];
            arr[temp] = x;
        }
    }

    public static void binarySearch(int[] arr, int x){
        int middle = 0;
        int first = 0;
        int last = arr.length-1;
        while(last>=first){
            middle = (last+first)/2;
            if(x < arr[middle])
                last = middle;
            else if (x > arr[middle])
                first = middle;
            else
                break;
        }
        if(x == arr[middle])
            System.out.println("The number is in position " + (middle+1));
        else
            System.out.println("The number is not in the list");
    }
}
