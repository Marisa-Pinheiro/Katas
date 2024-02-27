package javaKatas;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingLetter {
    public static String firstNonRepeatingLetter(String s){
        String sLower = s.toLowerCase();
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : sLower.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (charCount.get(Character.toLowerCase(c)) == 1) {
                return String.valueOf(c);
            }
        }
        return "";
    }
}

/*public class Kata {
    public static String firstNonRepeatingLetter(String s){
        for (String str : s.split("")) {
            if (s.toUpperCase().indexOf(str.toUpperCase()) == s.toUpperCase().lastIndexOf(str.toUpperCase())) return str;
        }
        return "";
    }
} */