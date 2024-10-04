package com.test;

import java.util.Arrays;

public class Test20 {
  
  public static void main(String[] args) {
    
     String a ="773781726";
     String b = "773781726";
     
     int maxDigits = a.length() > b.length()?a.length():b.length();
    
     char[] revA = new StringBuilder(a).reverse().toString().toCharArray();
     char[] revB = new StringBuilder(b).reverse().toString().toCharArray();
     
     char[] sum = new char[maxDigits];
     
     int carry = 0;
     for (int i = 0; i < maxDigits; i++) {
         
       int s = 0;
       if(i < revA.length) {
         s= s+Integer.parseInt(Character.toString(revA[i]));
       }
       if(i < revB.length) {
         s= s+Integer.parseInt(Character.toString(revB[i])) ;
       }
        s =  s+ carry;
       
        carry = 0;
        
        if(s >= 10) {
          int remainder = s % 10;
          carry = s/ 10 ;
          sum[i] = new Character(String.valueOf(remainder).toCharArray()[0]);
        }else {
          
          sum[i]= new Character(String.valueOf(s).toCharArray()[0]);
        }
      }
    
  String op = new  StringBuilder(String.valueOf(sum)).reverse().toString();
  
  System.out.println(carry+""+op);
  
  
    
  }

}
