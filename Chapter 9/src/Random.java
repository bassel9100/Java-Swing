import java.util.*;

public class Random {
    public static void main(String[] args){
        Methods m1 = new Methods();
        int[] arr = new int[10];
        String[] str = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eight", "ninth", "tenth and last"};
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.print("Please enter the " + str[i] + " number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        m1.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Which number are you searching for?");
        int x = sc.nextInt();
        m1.binarySearch(arr, x);

        System.out.println(m1.linearSearch(arr, 8));

    }
}