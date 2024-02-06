package collections;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LonelyInteger {


}

class Result {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 4, 2, 3));
        lonelyIntegerByMap(nums);

    }


    public static int lonelyIntegerByMap(List<Integer> numbers) {

        Map<Integer, Integer> numMap = new HashMap<>();

        // Count the occurrences of each number
        for (Integer num : numbers) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }

        // Find the lonely integer
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return entry.getKey();
            }
        }

        // If no lonely integer found, return 0
        return 0;
    }

    public static int lonelyinteger(List<Integer> a) {

        Set<Integer> newSet = new HashSet<>(a);

        for (int num: newSet){
            int frequency = Collections.frequency(a, num);
            if(frequency == 1){
                System.out.println(num);
            }
        }

        // Write your code here
   return 0;
    }

}

