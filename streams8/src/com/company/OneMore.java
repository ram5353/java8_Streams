package com.company;

import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OneMore {

  public static void main(String[] args) {
//    Stream<Date> stream = Stream.generate(() -> { return new Date(); });
//    stream.forEach(System.out::println);

//    Scanner scan = new Scanner(System.in);
//    Stream<Integer> numbers = Stream.of(new Integer[] {1,2,3,4,5,6,7});
//    numbers.filter(e -> e%2 == 0).forEach(e -> System.out.println(e));

    String str = "AAAAABBBACCC";
    List<String> strings = Arrays.asList(str.split(""));


    Map<String, Integer> collect = strings.stream()
      .collect(Collectors.toMap(s -> s, s -> 1, (value1, value2) -> ++value1));
    System.out.println(collect);



//    Stream.of(strings).collect(Collectors.toList());

    StringBuilder sb = new StringBuilder();
    str.chars().distinct().forEach(c -> sb.append((char) c));

    Set<String> set = strings.stream().collect(Collectors.toSet());
    System.out.println(set);

    String unique = sb.toString();
    char[] prefix = unique.toCharArray();
    System.out.println(prefix[0]);
    Stream.of(prefix).forEach(p -> System.out.println(p));

    for (int i=0;i<prefix.length;i++) {
      char letter = prefix[i];
//      List<String> filter = strings.stream().filter(s -> s.startsWith(String.valueOf(letter))).collect(Collectors.toList());
      long number = strings.stream().filter(s -> s.startsWith(String.valueOf(letter))).count();
      System.out.println(letter + "-> " + number);
//      System.out.println(filter.get(0));
//      System.out.println(filter.size());
    }






  }
}
