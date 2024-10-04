package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Test5 {

  public static void main(String[] args) {
    Address add = new Address("BLR");
    Employee emp = new Employee("e1", add);

    System.out.println("Address: " + emp.getAddress().city);

    add.city = "Pune";
    System.out.println("Address: " + emp.getAddress().city);

    Address add2 = new Address("Maysure");

    Abc abc = new Abc("xyz", add2);
    System.out.println(abc.toString());

    int[] arr = { 5, 5, 5, 5, 7, 7, 7, 3, 3, 1, 2, 9 };

    Map<Object, Long> map = Arrays.stream(arr).mapToObj(Integer::valueOf)
        .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));

    map.entrySet().stream().sorted(Comparator.comparing(Map.Entry<Object, Long>::getValue).reversed()).skip(1).limit(1).forEach(System.out::print);

  }

}

class Abc extends Employee {

  public Abc(String name, Address address) {
    super(name, address);
  }

  @Override
  public Address getAddress() {
    return super.getAddress();
  }

  @Override
  public String toString() {
    return super.toString();
  }

}

class Employee {
  private final String name;
  private final Address address;

  public Employee(String name, Address address) {
    super();
    this.name = name;
    this.address = new Address(address.city);
  }

  public String getName() {
    return name;
  }

  public Address getAddress() {
    return new Address(this.address.city);
  }

  @Override
  public String toString() {
    return "Employee [name=" + name + ", address=" + address + "]";
  }

}

class Address {
  String city;

  public Address(String city) {
    this.city = city;
  }
}
