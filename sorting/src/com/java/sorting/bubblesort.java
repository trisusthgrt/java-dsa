package com.java.sorting;

public class bubblesort{
    public void bubblesort(int[] arr){
        int n = arr.length;
        boolean swapping =false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){//gute trav re last ele sort hesi last re largest ele rahisi
                if(arr[j]>arr[j+1]){
                    swapping =true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(swapping==false){
                break;
            }
        }


    }
    
}
// each traversal re last ele sort hau thiba last adu sort hetel asba

