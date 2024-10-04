package com.test;

import java.util.HashSet;
import java.util.Set;

public class Test6 {
  
  private static Set<String> strings = new HashSet<>();
  public static void main(String[] args) {
 String s1 = "saltwater";
     String s2 = "aterltwsa";
    boolean isStrRev = checkStrRev(s1,s2);
    System.out.println(isStrRev);
    
  }
  
  private  static boolean  checkStrRev(String s1, String s2) {
    
    char[] chars = s1.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      String subStr = s1.substring(i+1);
      for (int j = 0; j < i+1; j++) {
        subStr +=chars[j];
      }
      strings.add(subStr);
    }
    
    if(strings.contains(s2)) {
      return true;
    }
    
    return false;
  }
  
//  boolean isStrRev = checkStrRev(String s1, String s2);
//  s1 = saltwater
//  s2 = atersaltw
//  isStrRev = true
//   
//  s1 = saltwater
//  s2 = aterltwsa
//  isStrRev = false

}
