package com.bootcamp.demo;

/**
 * Hello world!
 *
 */

// Library:
  // 1. Implicitly imported (JDK - java.lang), i.e. StringBuilder.class
  // 2.  Explicitly import (JDK - java.util, java.math), i.e. BigDecimal, ArrayList
  // 3. External Libraries - Outside of JDK (lombok), i.e. @Getter

// When you initialize a maven java projectm it preloads JDK library under java.land


// VSCode "RUN" button -> call javac
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        StringBuilder sb = new StringBuilder();
        
        Book book = new Book();
        book.setAuthor("Vicent");
        book.setPrice(30.1);
        book.setId(1);
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());
        System.out.println(book.getId());
        System.out.println(book);
        Book book2 = new Book(2, "Peter", 99.9);
        Book book3 = Book.builder()
        .author("Sally")
        .id(2)
        .price(99.9)
        .build();


    
    }
}
