package quicksort;

import java.util.Arrays;

public class TestQuickSort {
    public static void main(String[] args) {

        int[] arr={10,7,8,9,1,5};
        System.out.println("Array before quick Sort..");
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("Arrays after quick Sort..");
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low>=high) return;

        int pivot=partition(arr,low,high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
    }
    public static int partition(int[] arr, int low, int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public static  void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

/*
TC: Best case- O(nlogn)
    Average case- O(nlogn)
    Worst case- O(n*n)

SC: Best Case: O(logn)
    worst case: O(n)
 */
