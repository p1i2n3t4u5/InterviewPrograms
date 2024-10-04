package com.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test15 {

  public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        
        String[] strs = {"Good","Morning"};
        
        
List<Entry<Character, Long>>  e =   Arrays.stream(strs).reduce("", (t, u) -> t+u).chars()
       .mapToObj(c -> ((char)Character.toLowerCase(c)))
        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap<Character,Long>::new,Collectors.counting())).entrySet()
        .stream().filter(p -> p.getValue() == 1).limit(1)
        .toList();

   System.out.println(e);     
        
        
    }

}
