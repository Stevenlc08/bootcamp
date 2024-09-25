package com.bootcamp.demo;

import lombok.Data;
import lombok.NonNull;

@Data // @RequiredArgsConstructor
 // @AllArgsConstructor

// Class level Annotation

public class Person {
  @NonNull  // runtime checking on Constructor + Setter
  private String name; // non-nullable

  private String emailAddress; //  Nullable

  public static void main(String[] args) {
    Person p = new Person("John");
    System.out.println(p); // Person(name=John, emailAddress=null)

    Person p2 = new Person(null);  // compile OK
    // runtime -> java.lang.NullPointerException


  }
}

