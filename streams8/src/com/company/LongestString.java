package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class LongestString {

  //reduce method in streams
  public static void main(String[] args) {

    long[] arr = {10,20,30,40};
    aVeryBigSum obj = new aVeryBigSum();
    obj.sum(arr);


    List<String> str = Arrays.asList("h", "hello", "worldddd", "nnn");
    //longest string
    Optional<String> result = str.stream().reduce((s1, s2) -> s1.length()>s2.length()?s1:s2);
    result.ifPresent(System.out::println);
    //combine all strings
    Optional<String> combineString = str.stream().reduce((s1, s2) -> s1 + "" + s2);
    System.out.println(combineString);
    combineString.ifPresent(System.out::println);
    //Product of all elements
    int number = IntStream.range(2,8).reduce((s1,s2)->s1*s2).orElse(-1);
    System.out.println(number);


  }
}
