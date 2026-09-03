package mergesort;

import java.util.Arrays;

public class TestMerge {
    public static void main(String[] args) {
        int[] arr={10,7,8,9,1,5};
        System.out.println("Array before sorting:"+ Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println("Array after sorting:"+ Arrays.toString(arr));

    }
    public static void mergeSort(int[] arr,int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int[] arr,int low,int mid,int high){

        int[] tempArray=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){

            if(arr[i]<=arr[j]){
                tempArray[k++]=arr[i++];
            }
            else{
                tempArray[k++]=arr[j++];
            }
        }
        while(i<=mid){
            tempArray[k++]=arr[i++];
        }
        while(j<=high){
            tempArray[k++]=arr[j];
        }

        for(int p=0,q=low;p< tempArray.length;p++,q++){
            arr[q]=tempArray[p];
        }
    }


    /*
    timecomplexity: best,worst,average - O(nlogn)
    spacecomplexity: creating tmp array to store data for merging two sorted array
                     // O(n)
     */

}
