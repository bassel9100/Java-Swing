import java.lang.reflect.Array;
import java.util.*;

public class Random {
    public static void main(String[] args){
        int[] arr = new int[10];
        String[] str = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eight", "ninth", "tenth and last"};
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.print("Please enter the " + str[i] + " number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Which number are you searching for?");
        int x = sc.nextInt();
        binarySearch(arr, x);

        System.out.println(linearSearch(arr, 8));

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