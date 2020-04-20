package com.muti.learning.Java14Funcional.javaImprovement;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Java 9: Stream API improvements
public class JavaStreamNinePOC {

   private static Predicate<Integer> isEven = i -> (i % 2 == 0);

   public static void main(String[] args) {
      streamTakeWhile();
      streamDropWhile();
      streamFilter();
      streamOfNullable();
      streamIteration(10);
      
   }
   
   
   // Filter will take all elements that comply with the predicate
   public static void streamFilter() {
      List<Integer> list = Stream.of(0, 2, 66, 4, 120, 777, 88, 44, 22, 880).filter(isEven)
            .collect(Collectors.toList());
      System.out.println(list);
   }
   
   // Enables to create a stream of null elements
   public static void streamOfNullable() {
      List<Object> list = Stream.ofNullable(null).collect(Collectors.toList());
      System.out.println(list);
   }
   

   // Take while will take all the elements of the stream in order until the predicate is not met
   public static void streamTakeWhile() {
      List<Integer> list = Stream.of(0, 2, 66, 4, 120, 777, 88, 44, 22, 880).takeWhile(isEven)
            .collect(Collectors.toList());
      System.out.println(list);
   }
   
   
   // Take while will drop all the elements of the stream in order until the predicate is not met
   public static void streamDropWhile() {
      List<Integer> list = Stream.of(0, 2, 66, 4, 120, 777, 88, 44, 22, 880).dropWhile(isEven)
            .collect(Collectors.toList());
      System.out.println(list);
   }
   
   // Take while will drop all the elements of the stream in order until the predicate is not met
   public static void streamIteration(final int limit) {
      Stream.iterate(1, i -> i <= limit, i -> i + 1)  
      .map(x -> x * x)
      .forEach(System.out::println);  
   }
   
   
   

}
