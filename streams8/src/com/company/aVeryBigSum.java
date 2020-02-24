package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class aVeryBigSum {
  public void sum(long[] arr ) {
    LongStream list = Arrays.stream(arr);
    long number = list.reduce(0,(ans, s1) -> ans+s1);
    System.out.println(number);


    List<Long> ints = LongStream.of(arr)
      .boxed()
      .collect(Collectors.toList());
    long numb = ints.stream().reduce((long) 0,(ans, s1) -> ans+s1);
    System.out.println(number);

  }

  public void minmaxSum(int[] arr) {
    List<Integer> list = IntStream.of(arr)
      .boxed()
      .collect(Collectors.toList());
    Optional<Integer> maximum = list.stream().max(Integer::compareTo);
    Optional<Integer> minimum = list.stream().min(Integer::compareTo);

    Integer sum = list.stream().reduce(0,(ans,s1) -> (ans+s1));

    Integer minSum = sum - maximum.get();
    Integer maxSum = sum - minimum.get();

    System.out.println(minSum + " " + maxSum);


  }


}
