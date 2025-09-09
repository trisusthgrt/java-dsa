package com.java.java_dsa;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class student {

  private String name;
  private ArrayList<Integer> marks =new ArrayList<>();

  public student(String name, int... marks){//varibale args , it should be last args
    this.name = name;
    // this.marks=marks;
    for(int mark:marks){
      this.marks.add(mark);
    } 

  }

  public int getNumberOfMarks(){
    // return marks.length;
    return marks.size();
  }
  public int getTotalMarks(){
    int sum=0;
    for(int mark:marks){
      sum+=mark;
    }
    return sum;
  }

  public int minMarks(){
    // int mini =Integer.MAX_VALUE;
    // for(int mark:marks){
    //   if(mark<mini){
    //     mini=mark;
    //   }
    // }
    // return mini;
    return Collections.min(marks);
  }
  public int maxMarks(){
    // int maxi=Integer.MIN_VALUE;
    // for(int i:marks){
    //   if(i>maxi){
    //     maxi=i;
    //   }
    // }
    // return maxi;
    return Collections.max(marks);
  }
  public BigDecimal getAverageMarks() {
    return BigDecimal.valueOf(getTotalMarks()).divide(BigDecimal.valueOf(getNumberOfMarks()),3, RoundingMode.UP);
  }

  // public void addMarks(int... newMarks){

  // }
  public void show(){
    System.out.println("Name: " + name);
    System.out.println("Marks: " + marks);
  }
  public void addMarks(int... newMarks){
    for(int mark:newMarks){
      marks.add(mark);
    }
  }

  public void removeMarks(int idx){
    if(idx>=0 && idx<marks.size()){
      marks.remove(idx);
    }
  }

  
 
}
