package com.java.java_dsa;
import java.util.*;
public class dsa {

  public static void main(String[] args) {
    
      // ArrayList<Integer> list = new ArrayList<Integer>();
      // list.add(1);
      // list.add(2);
      // list.add(3);
      // list.add(4);
      // list.add(0,0);
      // list.remove(3);
      // list.set(1,3);
      // System.out.println(list.contains(3));
      // System.out.println(list.size());
      // System.out.println(list.get(2));
      // System.out.println(list.indexOf(0));
      // System.out.println(list.lastIndexOf(0));
      // Collections.sort(list);
      // System.out.println(list);

      LinkedList<Integer>LL=new LinkedList<Integer>();
      LL.add(1);
      LL.add(2);
      LL.add(3);
      LL.add(4);
      System.out.println(LL);
      LL.addFirst(0);
      LL.addLast(5);
      System.out.println(LL);
      LL.removeFirst();
      LL.removeLast();
      System.out.println(LL);
      LL.set(2,10);
      System.out.println(LL);
      System.out.println(LL.get(2));
      System.out.println(LL.contains(10));
      System.out.println(LL.size());
      Collections.sort(LL);
      System.out.println(LL);
      Collections.reverse(LL);
      System.out.println(LL);
      Collections.sort(LL,Collections.reverseOrder());
      System.out.println(LL);
  }

}
