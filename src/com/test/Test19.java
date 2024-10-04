package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test19 {

  public static void main(String[] args) {
    
//    XXI - 21
//    I -1
//    V - 5
//    X -10 
//    L -50
//    c-100
//    XCI -91
    
    
    int xValue = 10;
    int vValue = 5;
    int iValue = 1;  
    int lValue = 50;
    int cValue = 100;
    
    Map<Character,Integer> map = new HashMap<>();
    map.put('X',10);
    map.put('V',5);
    map.put('I',1);
    map.put('L',50);
    map.put('C',100);
    
    
    String input = "XXI";
   
    Set<Character>  set =new HashSet<Character>();
    int temp =0;
    for (char ch : input.toCharArray()) {
      set.add(ch);
      temp =temp + map.get(Character.toUpperCase(ch));
     long count =  set.stream().map(p -> map.get(Character.toUpperCase(p))).filter(q -> (q < map.get(Character.toUpperCase(ch)))).count();
      if(count > 0) {
        temp =  map.get(Character.toUpperCase(ch)) - temp;
      }
    }
    System.out.println(temp);
  }

}
