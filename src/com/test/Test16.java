package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test16 {
  
//  A fruit has below properties:
//    1. Name
//    2. Color
//    3. Price
//
//    Create a collection and add below fruits to it.
//
//    Name color price 
//    Apple Red 100
//    Banana Yellow 20
//    Strawberry Red 150
//    Guava Green 80
//    Papaya Yellow 40
//
//    1. Print names of all the red fruits
//    2. Sort fruits by ascending price.Then, print name and price of each fruit (such that cheapest fruit comes first)
  
  
  public static void main(String[] args) {
    
    List<Fruit>  fruits = new ArrayList<>();
    fruits.add(new Fruit("Apple", "Red", Double.valueOf(100)));
    fruits.add(new Fruit("Banana", "Yellow", Double.valueOf(20)));
    fruits.add(new Fruit("Strawberry", "Red", Double.valueOf(150)));
    fruits.add(new Fruit("Guava", "Green", Double.valueOf(80)));
    fruits.add(new Fruit("Papaya", "Yellow", Double.valueOf(40)));
    
    fruits.stream().filter(p -> p.getColor().equals("Red")).forEach(p -> {
      System.out.println(p.getName());
    });
    
    fruits.stream().sorted(Comparator.comparingDouble(Fruit::getPrice)).forEach(p -> {
      System.out.println(p.getName() +"  "+p.getPrice());
    });;
    
    
    
    
  }

}

class Fruit{
  
  private String name;
  private String color;
  private Double price;
  
  public Fruit(String name, String color, Double price) {
    super();
    this.name = name;
    this.color = color;
    this.price = price;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }
  
  
}
