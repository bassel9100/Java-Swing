import java.util.Arrays;

import static java.lang.System.out;

/**
* Most common sorting methods re-implemented
* HELLLOOOOOOO! I LOVE SORTED ARRAYS! MAKES LIFE EASIER!
*/
public class Sorting {

    public void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public void bubbleSort(int[] arr){ // Normal case O(n^2), Best Case O(n)
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length -1 -i; j++){
                if(arr[j] > arr[j+1])
                    swap(arr, j, j+1);
            }
        }
    }

    public void insertionSort(int[] arr){ // Normal case O(n^2), Best Case O(n)
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }

    public void selectionSort(int[] arr){ // Normal case O(n^2), Best Case O(n^2)
        int min = 0;
        for(int i = 0; i < arr.length-1; i++){
            min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[min] > arr[j])
                    min = j;
            }
         if(min != i)
            swap(arr, i, min);
        }
    }


    public static void main(String[] args){
        new Sorting().program();
    }

    public void program(){
        int[] arr = {400000,-25,1,5,76,94,2,4897,1,4,6,8,99996,5,3};
        selectionSort(arr);
        out.println(Arrays.toString(arr));
        out.println(Searching.binarySearch(arr, 400000));
    }

}
