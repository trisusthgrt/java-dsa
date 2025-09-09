package com.java.sorting;

public class selectionsort {
    public static void selectionsort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minidx =i;
            for(int j=i+1;j<n;j++){
                if(arr[minidx]>arr[j]){
                    minidx =j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
    }
}
// pura array ru san ele anbu aau first re rakhbu left adu sort hetel jiba
