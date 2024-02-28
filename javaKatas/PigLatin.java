package javaKatas;

import java.util.regex.Pattern;
//Move the first letter of each word to the end of it,
// then add "ay" to the end of the word. Leave punctuation marks untouched.
//pigIt('Pig latin is cool'); // igPay atinlay siay oolcay

public class PigLatin {

    //Firs iteration
    public static String pigIt(String str) {
        // 1st iteration

        /*StringBuilder result = new StringBuilder();
        String[] words = str.split(" ");
        for (String s : words){
            //Within the loop, the code checks if the current word s is a punctuation mark using
            // a regular expression (\p{IsPunctuation}).
            // If it is, it appends the original word and the punctuation mark to the result string.
            if( Pattern.matches("\\p{IsPunctuation}", s)){
                result.append(s);
            }
            //If the word is not a punctuation mark,
            // it converts it to Pig Latin by moving the first letter to the end and appending "ay".
            else {
                result.append(s.substring(1))
                        .append(s.charAt(0))
                        .append("ay");
            }
            // Trimming extra spaces
            while (result.charAt(result.length() - 1) == ' ') {
                result.setLength(result.length() - 1);
            }

        }
        return new String(result);*/

        // 2nd iteration
            StringBuilder result = new StringBuilder();
            for (String s : str.split(" ")) {
                result.append(Pattern.matches("\\p{Punct}", s) ?
                        s : s.substring(1) + s.charAt(0) + "ay").append(" ");
            }
            return result.toString().trim();
        }

        // Others response I liked
        /*
        public class PigLatin {
        public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
            }
        }
        */
    }