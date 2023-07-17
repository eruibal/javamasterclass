public class NumberPalindrome {
     public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;
        while (java.lang.Math.abs(number) > 0) {
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number = number / 10;
        }
        return originalNumber == reversedNumber;
    }
}