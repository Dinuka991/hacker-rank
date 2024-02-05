package sorrting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinMax {

    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 1, 3};
        List<Integer> integers = Arrays.stream(numbers).boxed().toList();
        minMaxSum(integers);
        minMaxSumTypeA(integers);

    }


    // Type 1  - using stream api

    public static  void minMaxSum(List<Integer> arr){

          long min = arr.stream().sorted().limit(4).limit(4).mapToLong(Integer::intValue).sum();
          long max = arr.stream().sorted( (a,b) -> b - a ).limit(4).mapToLong(Integer::intValue).sum();
            System.out.println(min + " "  +max);
    }
  // Type 2 - using Collections.sort

    public static void minMaxSumTypeA(List<Integer> arr) {
        Collections.sort(arr);

        long min = arr.subList(0,4).stream().mapToLong(Integer::intValue).sum();
        arr.sort(Collections.reverseOrder());
        long max = arr.subList(0,4).stream().mapToLong(Integer::intValue).sum();
        System.out.println(min + " "  +max);
    }

}




