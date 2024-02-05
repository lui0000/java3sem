package Recursion;

public class Recursion {
    public static void isPrime(int n, int divisor) {
        if (n < 2 || n % divisor == 0) {
            System.out.println("NO");
        } else if (divisor <= Math.sqrt(n)) {
            isPrime(n, divisor + 1);
        } else {
            System.out.println("YES");
        }
    }

    public static void findFactors(int n) {
        int divisor = 2;
        while (n > 1) {
            if (n % divisor == 0) {
                System.out.print(divisor + " ");
                n /= divisor;
            } else {
                ++divisor;
            }
        }
        System.out.println();
    }

    public static void isPalindrome(String str) {
        // Base case: If the string is empty or has only one character, it's a palindrome.
        if (str.length() <= 1) {
            System.out.println("YES");
            return;
        }

        // If the first and last characters are not the same, it's not a palindrome.
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            System.out.println("NO");
            return;
        }

        // Recursively check the substring without the first and last characters.
        String subStr = str.substring(1, str.length() - 1);
        isPalindrome(subStr);
    }

    public static int noConsecutiveZeroes(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println(1);
        } else {
            return noConsecutiveZeroes(a - 1, b) + noConsecutiveZeroes(a, b - 1);
        }
        return 0;
    }

    public static int reverseNumber(int n) {
        if (n < 10) {
            return n;
        } else {
            int lastDigit = n % 10;
            int remainingDigits = n / 10;
            int reverseRemaining = reverseNumber(remainingDigits);
            int numDigits = (int) Math.log10(reverseRemaining) + 1;
            return lastDigit * (int) Math.pow(10, numDigits) + reverseRemaining;
        }
    }

    // test method
    public static void main(String[] args) {
        isPrime(17, 5);
        findFactors(100);
        isPalindrome("abobat");
        System.out.println(noConsecutiveZeroes(5, 8));
        System.out.println(reverseNumber(12));
    }
}