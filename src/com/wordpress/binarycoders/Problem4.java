package com.wordpress.binarycoders;

/**
 * Largest palindrome product
 * <p>
 * Problem 4
 * <p>
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {

    public static void main(String[] args) {
        System.out.println(Problem4.solve());
    }

    private static long solve() {
        long largestPalindrome = 0;
        int first = 100;

        while (first <= 999) {
            int second = first;

            while (second <= 999) {
                long tmp = first * second;

                if (isPalindrome(tmp) && (tmp > largestPalindrome)) {
                    largestPalindrome = tmp;
                }

                second++;
            }

            first++;
        }


        return largestPalindrome;
    }

    private static boolean isPalindrome(final long number) {
        return String.valueOf(number).equals(reverse(String.valueOf(number)));
    }

    private static String reverse(final String number) {
        return new StringBuilder(number).reverse().toString();
    }
}
