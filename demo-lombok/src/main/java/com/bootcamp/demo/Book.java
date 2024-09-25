package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter; // code
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// JavaDeveloper: You have to 100% understand the generated code after compile

// Maven:
   // Re-define compile process;
   // 1. "mvn clean compile" -> External annoitation (Outside JDK)
   // 2. if yes, re-generate the java source code(java file)
   // 3. Compile class file (byte code)

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode

public class Book {
   private int id;
   private String author;
   private double price;
}
