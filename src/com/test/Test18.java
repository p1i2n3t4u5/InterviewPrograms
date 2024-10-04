package com.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test18 {
  
  public static void main(String[] args) {
    String s = "cbbebi";
    int k = 3;

    Set<String> set = new HashSet<>();

    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < args.length; j++) {
        set.add(s.substring(i, j));
      }
    }

    System.out.println(set);

    Map<String, Integer> map = new HashMap<>();

    for (String ss : set) {
      map.put(ss, new HashSet<>(ss.chars().mapToObj(p -> (char) p).collect(Collectors.toList())).size());
    }

    System.out.println(map);

    List<Map.Entry<String, Integer>> entries = map.entrySet().stream().filter(p -> p.getValue() == k)
        .sorted(Map.Entry.<String,Integer>comparingByKey(Comparator.comparingInt(String::length)).reversed()).limit(1)
        .collect(Collectors.toList());

    System.out.println(entries);
  }

}
