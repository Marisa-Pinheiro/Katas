package javaKatas;
/*
Kata: java.Scramblies on Codewars
Author: joh_pot
Ranking: 5kyu
*/

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        //Only lowercase letters
        int[] charCount = new int[26];

        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : str2.toCharArray()) {
            int index = c - 'a';
            if (index < 0 || index >= charCount.length || charCount[index] <= 0) {
                return false;
            }
            charCount[index]--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "rkqodlw";
        String str2 = "world";
        System.out.println(scramble(str1, str2));
    }

}