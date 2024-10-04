package com.test;

public class Test3 {
  
  public static void main(String[] args) {
   int[] arr = { 1, 4, 5, 2,8,9};
   
   int midIndex =  (arr.length/2)-1;
   int pointer1 = (arr.length/2)-2;
   int pointer2 = (arr.length/2);
   int leastValue = 0;
   int maxValue = 0;  
   for (int i = 0; i < (arr.length/2)+1; i++) {
     
     if( pointer1>=0 &&  arr[pointer1] < arr[midIndex]  ) {
       leastValue = arr[pointer1];
     }
     pointer1--;
     
     if(pointer2 <=arr.length-1 && arr[pointer2] > arr[midIndex]) {
       maxValue = arr[pointer2];
     }
     pointer2++;
  }
   
   System.out.println("min  "+leastValue+"maxvalue  "+maxValue);
   
  }

}
