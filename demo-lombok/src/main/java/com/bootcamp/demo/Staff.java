package com.bootcamp.demo;

import lombok.NonNull;

public class Staff {
  private String name;
  private Double salary;

  public Staff(@NonNull String name, @NonNull Double salary) {
    this.name = name;
    this.salary = salary;
  }

  public void work(@NonNull String detail){
    System.out.println("Staff is working ...");
  }
  public static void main(String[] args) {
    new Staff("John", 20000.0).work("something");
    new Staff("Peter", 25000.0).work(null); // java.lang.NullPointerException
  }
}
