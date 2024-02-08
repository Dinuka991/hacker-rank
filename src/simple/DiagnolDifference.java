package simple;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class DiagnolDifference {

    public static void main(String[] args) {

        List<List<Integer>>  newLs = new ArrayList<>();


        newLs.add(List.of(11,2,4));
        newLs.add(List.of(4,5,6));
        newLs.add(List.of(10,8,-12));

        System.out.println(diagonalDifference(newLs));


    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int val = 0;
        int val2 = 0;

        int length =  arr.size();

        for(int i = 0; i < length  ; i ++){
                val +=  arr.get(i).get(i);
                val2 +=  arr.get(i).get(length - i -1);

        }
      return  Math.abs(val2-val);
    }
}
