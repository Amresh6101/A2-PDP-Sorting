package heapsort;

import java.util.Arrays;

public class TestHeapSort {
    public static void main(String[] args) {
        /*
         Heap Sort is an O(n log n), in-place sorting algorithm that uses a binary heap.
         */
        // sort an array using heap sort
        int[] arr={2,1,0,4,8,6,5};
        System.out.println("Array Before Heap Sort..");
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println("Array After Heap Sort..");
        System.out.println(Arrays.toString(arr));
    }
    public static void heapSort(int[] arr){
        int n=arr.length;
        // build heap
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        // extract element from heap one by one
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,i,0);
        }
    }
    public static  void heapify(int[] arr,int heapSize,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        // if left child is larger than root
        if(left<heapSize && arr[left]>arr[largest]){
            largest=left;
        }
        // if right child is larger than largest
        if(right<heapSize && arr[right]>arr[largest]){
            largest=right;
        }
        // if largest is not root
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr,heapSize,largest);
        }
    }
}

/*
Time complexity:
    Build Heap- O(n)
    Heapify- O(logn)
    Extract Element- O(nlogn)
    Overall time complexity: O(nlogn) -- best,average,worst

Space complexity: O(1) In place sorting
 */