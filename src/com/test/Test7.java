package com.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test7 {
  
  public static void main(String[] args) {
    
    Map<String,String> map = new HashMap<>();
    map.put("b", "ball");
    map.put("a", "apple");
    map.put("c", "cal");
    
  Map<String,String>  newMap =  map.entrySet().stream().sorted(Map.Entry.<String,String>comparingByKey())
    .collect(Collectors.toMap(p -> p.getKey(), q -> q.getValue(),(a,b)-> a,LinkedHashMap::new));
  
  System.out.println(newMap);
    
  }

}
