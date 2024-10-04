package com.test;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Test {
  
  public static void main(String[] args) {
//    
////    Function<Integer,String> fun = (a) -> a+"";
////    System.out.println(fun.apply(1));
//    
//    String str = "KETATEK";
//    char[] charArray =str.toCharArray();
//    
////    int pointer1=0;
////    int pointer2=0;
//    for (int i = 0; i < charArray.length; i++) {
//      for (int j = 0; j < charArray.length; j++) {
//
//        if (j > i && charArray[i] == charArray[j] && (i - j == 2 || i - j == -2) && charArray[i + 1] != charArray[i]) {
//          System.out.println("Its a Pallendrom ");
//        }
//      }
//    }
//    
    
//    Java 8 program to square the list of numbers.
//    Integer[] arr = new Integer[] { 100, 100, 9, 8, 200 };
//    then filter out the numbers greater than 100 
//     then find the average of the remaining numbers
     
   // o/p - average of numbers having greater than 100  
    
    Integer[] arr = new Integer[] { 100, 100, 9, 8, 200 };
    
    Arrays.asList(arr).stream().map(p -> p*p).filter(a -> a > 20000).forEach(System.out::println);
    
    
    
    
    
  }

}
