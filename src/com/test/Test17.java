package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test17 {
  
//  Find most frequently occurring word(s) along with its frequency in given statement
//  • Example input: "John is an employee of ABC company, JOHN is from India, JOHN! is good in java.“
//  • Expected output: Words – John, is & frequency - 3
  
public static void main(String[] args) {
  String str = "John is an employee of ABC company, JOHN is from India, JOHN! is good in java.";
  str = str.replaceAll("!", "");
  String[] strArr = str.split(" ");
  
 Map<String,String>  map = Arrays.stream(strArr).collect(Collectors.toMap(p->p.toLowerCase(),p->p,(t1,t2)->t1));
  
  List<Map.Entry<String, Long>>  entries =  Arrays.stream(strArr).map(p -> p.toLowerCase()).collect(Collectors.groupingBy(p -> p.toString(),Collectors.counting())).entrySet().stream()
  .sorted(Comparator.comparing( Map.Entry<String,Long>::getValue).reversed()).collect(Collectors.toList());
  
 Long maxrep =  entries.get(0).getValue();
 
 entries.stream().filter(p -> (p.getValue() == maxrep)).forEach(p -> {
   
   //System.out.println(map.get(p.getKey()) +" "+p.getValue());
   
 });
 
 StringBuilder s = new StringBuilder();
 for (Entry<String, Long> entry : entries) {
   if(entry.getValue() == maxrep) {
   s.append(map.get(entry.getKey()));
   s.append(",");
   }
}
 
 System.out.println(""+s +"  "+entries.get(0).getValue());
 
 
 
 
  
}

}
