package com.java.java_dsa;

import java.util.ArrayList;

public class studentRunner {
  public static void main(String[] args) {
    // int[] marks = {100, 99, 99,70,60,88};
    student s = new student("Sush", 100, 99, 99,70,60,88);
    s.show();
    System.out.println("Number of Marks: " + s.getNumberOfMarks());
    System.out.println("Total Marks: " + s.getTotalMarks());
    System.out.println("Minimum Marks: " + s.minMarks());
    System.out.println("Maximum Marks: " + s.maxMarks());
    System.out.println("Average Marks: " + s.getAverageMarks());
    
    s.addMarks(98,99);
    s.removeMarks(3);
    s.show();
    System.out.println("Number of Marks: " + s.getNumberOfMarks());
    System.out.println("Total Marks: " + s.getTotalMarks());
    System.out.println("Minimum Marks: " + s.minMarks());
    System.out.println("Maximum Marks: " + s.maxMarks());
    System.out.println("Average Marks: " + s.getAverageMarks());
    
  }
}
