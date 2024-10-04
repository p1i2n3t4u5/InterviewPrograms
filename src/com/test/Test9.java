package com.test;

public class Test9 {
  
  public static void main(String[] args) {
    
//    You are given a string consisting of the letters x and y, such as xyxxxyxyy. 
//    In addition, you have an operation called flip, which changes a single x to y or vice versa.  
//    Determine how many times you would need to apply this operation to ensure that all x's come before all y's.
    //  In the preceding example,
//    it suffices to flip the second and sixth characters, so you should return 2.
//  
    
    String s = "yyyyxxx";
    char[]  chars = s.toCharArray();
    char beforeChar = chars[0];
    int flipsRequired = 0;
    Character flipedChar = null ;
    
    for (int i = 1; i < s.toCharArray().length-1; i++) {
      
      if(beforeChar == chars[i+1] && beforeChar !=chars[i] ) {
        if(flipedChar == null) {
          flipedChar = chars[i];
        }
        if(flipedChar == chars[i]) {
          flipsRequired++;
        }
      }
      beforeChar = chars[i];
    }
    
   
    
    if (flipsRequired == 0 && chars[0] != 'x') {
      flipsRequired = chars.length;
    }
    
    for (int i = 0; i <= chars.length/2; i++) {
        int  k = chars.length-1-i;
        char temp =  chars[i];
        chars[i] =   chars[k];
        chars[k] = temp;
    }
    
    System.out.println((chars.length/2)*2);
  //  ["xy", "yx", "yyx", "yyyyxxx"]
    
  }

}
