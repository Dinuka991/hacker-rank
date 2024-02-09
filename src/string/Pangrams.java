package string;

import java.util.HashSet;
import java.util.Set;

public class Pangrams {

    public static void main(String[] args) {
        System.out.println( pangrams("amamdwa"));

    }

    public static String pangrams(String s) {


        Set<Character> characters = new HashSet<>();
        // Write your code here
        for(int i=0 ; i < s.length() ; i++){
            if(Character.isLetter(s.charAt(i))) {
                characters.add( Character.toLowerCase(s.charAt(i)));
            }
        }

        if(characters.size() == 26){
            return "pangram";
        } else {
            return "not pangram";
        }

    }




}
