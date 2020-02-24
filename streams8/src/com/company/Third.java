package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Third {

  public static void main(String[] args) {

    StringBuilder str = new StringBuilder();
    str.append("Hello");
    str.append("hi");
    System.out.println(str.toString());
    System.out.println(str.capacity());
    str.reverse();

    System.out.println(str);
    String string = new String("ram");
    System.out.println(string);
    List<String> newString = Arrays.asList(string.split("",10));
    System.out.println(newString);





  }
}
