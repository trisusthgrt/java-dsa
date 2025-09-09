package com.java.sorting;

public class runnerclass {
    public static void main(String[] args) {
        int[] arr={99,34,33,44,53,56,1,100,22,34,92};
        int[] barr=arr.clone();
        System.out.println("Before sorting");
        for(int i:barr){
            System.out.print(i + " ");
        }
        System.out.println();
        bubblesort bs =new bubblesort();
       bs.bubblesort(barr);
        System.out.println("After sorting");
        for(int i:barr){
            System.out.print(i + " ");
        }
        System.out.println();
        int[] sarr=arr.clone();
        System.out.println("Before sorting");
        for(int i:sarr){
            System.out.print(i + " ");
        }
        System.out.println();
        selectionsort.selectionsort(sarr);
        System.out.println("After sorting");
        for(int i:sarr){
            System.out.print(i + " ");
        }
        System.out.println();
        int[] iarr=arr.clone();
        System.out.println("before sorting");
        for(int i:iarr){
            System.out.print(i + " ");
        }
        System.out.println();
       insertionsort.insertionsort(iarr);
        System.out.println("After sorting");
        for(int i:iarr){
            System.out.print(i + " ");
        }
        System.out.println();
        int[] marr=arr.clone();
        System.out.println("before sorting");
        for(int i:marr){
            System.out.print(i + " ");
        }
        System.out.println();
        mergesort.mergesort(marr);
        System.out.println("After sorting");
        for(int i:marr){
            System.out.print(i + " ");
        }
    }
}
