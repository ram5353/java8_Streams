package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
      List<String> list = new ArrayList<>();
      list.add("hi");
      list.add("hello");
      list.add("spring");
      list.add("boot");
      Stream<String> stream = list.stream();
      String prefix = "s";
      List<String> filteredStream = stream.sorted().collect(Collectors.toList());
      filteredStream.forEach(System.out::println);
      System.out.println(filteredStream.get(0));
//      List<String> filteredStream = stream.filter(e -> e.startsWith(prefix)).collect(Collectors.toList());
//      System.out.println(filteredStream);
//      filteredStream.forEach(System.out::println);

//      List<String> updateStream = stream.map(e -> e.toUpperCase()).collect(Collectors.toList());
//      updateStream.forEach(System.out::println);
//      updateStream.forEach(e -> System.out.println(e));


      List<String> strList = new ArrayList<>();
      strList.add("Amitabh");
      strList.add("Shekhar");
      strList.add("Aman");
      strList.add("Rahul");
      strList.add("Shahrukh");
      strList.add("Salman");
      strList.add("Yana");
      strList.add("Lokesh");

      strList.stream().sorted().forEach(System.out::println);




//      Stream<List<String>> stream1 = Stream.of(filteredStream);
//      stream1.forEach(e -> System.out.println(e));

      IntStream letters = "12345_abcdefg".chars();
      letters.forEach(e -> System.out.println(e));

      String str = "A$B$C";
      List<String> stream3 = Stream.of("A$B$C".split("\\$")).collect(Collectors.toList());


      IntStream stream4 = "12345_abcdefg".chars();
      stream4.forEach(p -> System.out.println(p));




    }
}
