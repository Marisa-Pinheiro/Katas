package javaKatas;

public class Rot13 {

    public static String rot13(String message) {
        char[] letters = message.toCharArray();
        for( int i=0; i<letters.length; i++){
            char letter = letters[i];
            if (letter >= 'a' && letter <= 'z') {
                if (letter > 'm') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
            } else if (letter >= 'A' && letter <= 'Z') {
                if (letter > 'M') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
            }
            letters[i] = letter;
        }
        return new String(letters);
    }
        }