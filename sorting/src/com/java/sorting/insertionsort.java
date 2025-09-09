package com.java.sorting;

public class insertionsort {
    public static void insertionsort(int[] arr) {
        int n = arr.length;
        for(int i=1;i<n;i++){// assume oth ele sorrt ache
            int key=arr[i];// jahake sortr karbar ache
            int j=i-1;//key agarar ele re dekhbu kenta ee mg ru bad achan kain
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
                // agke badhabu kajeki key amar valu store already ache aau key ke amaku thik jaga re rakhbar ache

            }
            arr[j+1]=key;//j+1 kajeki j-- heuche na be
        }
    }
}
