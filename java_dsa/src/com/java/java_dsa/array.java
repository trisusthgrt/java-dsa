package com.java.java_dsa;

import java.util.Arrays;

public class array {
  class Dummy{

  }
  public static void main(String[] args) {
    int[] arr2 = {9,2,3};
    int[] arr1 = {1,2,3};
    
    System.out.println(Arrays.equals(arr1, arr2));
    Arrays.sort(arr1);
    for (int i : arr1) {
      System.out.println(i);
    }
    Dummy[] d = new Dummy[10];
    for (int i = 0; i < d.length; i++) {
      System.out.println("Dummy object " + i + ": " + d[i]);
    }
  }
}
