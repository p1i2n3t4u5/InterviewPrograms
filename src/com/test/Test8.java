package com.test;

import java.util.Arrays;
import java.util.Iterator;

public class Test8 {
  
//  Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.
//
//  Note: There may be more than one subarray with sum as the given sum, print first such subarray. 
//
//  Examples: 
//
//  Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
//  Output: Sum found between indexes 2 and 4
//  Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
//
//  Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 25
  
public static void main(String[] args) {
  int[] arr = {1, 4, 20, 3, 10, 5};
  
  for (int i = 0; i < arr.length; i++) {
    for (int j = i; j < arr.length; j++) {
      
        Arrays.copyOfRange(arr, i, j);
        
        
//         if() {
//           
//           
//         }
//      
  
      
    }
  }
  
  
  
//  Write the code snippet to find the denomination of coins/notes with minimum count to make the given sum.
//  Available denominations - 1, 2, 5, 10, 20
//
//   
//      eg. 78 = 20 * 3 + 10 * 1 + 5 * 1 + 2 * 1 + 1 * 1
//          66 = 20 * 3 + 2 * 3
}
  
  

}
