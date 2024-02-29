package javaKatas;

/*
"Interesting" Numbers
Interesting numbers are 3-or-more digit numbers that meet one or more of the following criteria:

Any digit followed by all zeros: 100, 90000
Every digit is the same number: 1111
The digits are sequential, incementing†: 1234
The digits are sequential, decrementing‡: 4321
The digits are a palindrome: 1221 or 73837
The digits match one of the values in the awesomePhrases array
† For incrementing sequences, 0 should come after 9, and not before 1, as in 7890.
‡ For decrementing sequences, 0 should come after 1, and not before 9, as in 3210.
 */

//NOT RESOLVED
import java.util.regex.Pattern;

public class CarMileage {

    public static int isInteresting(int number, int[] awesomePhrases) {
        if (number < 100) return 0; // Not interesting if less than 100

        // Check if number is interesting
        if (isInterestingNumber(number, awesomePhrases)) return 2;

        // Check if number is almost interesting
        if (isAlmostInteresting(number, awesomePhrases)) return 1;

        return 0; // Not interesting
    }

    private static boolean isInterestingNumber(int number, int[] awesomePhrases) {
        String strNumber = String.valueOf(number);
        return isSequentialIncrementing(strNumber) || isSequentialDecrementing(strNumber) || isPalindrome(strNumber) || isAllZeros(strNumber) || isInAwesomePhrases(number, awesomePhrases);
    }

    private static boolean isAlmostInteresting(int number, int[] awesomePhrases) {
        return isInterestingNumber(number + 1, awesomePhrases) || isInterestingNumber(number + 2, awesomePhrases) ||
                isInterestingNumber(number - 1, awesomePhrases) || isInterestingNumber(number - 2, awesomePhrases);
    }

    private static boolean isSequentialIncrementing(String number) {
        return Pattern.matches("1234567890|9876543210", number) || Pattern.matches("0987654321|0123456789", number);
    }

    private static boolean isSequentialDecrementing(String number) {
        return Pattern.matches("9876543210|0987654321", number) || Pattern.matches("0123456789|9876543210", number);
    }

    private static boolean isPalindrome(String number) {
        return number.equals(new StringBuilder(number).reverse().toString());
    }

    private static boolean isAllZeros(String number) {
        return number.matches("[1-9]0+");
    }

    private static boolean isInAwesomePhrases(int number, int[] awesomePhrases) {
        for (int phrase : awesomePhrases) {
            if (number == phrase) return true;
        }
        return false;
    }
}