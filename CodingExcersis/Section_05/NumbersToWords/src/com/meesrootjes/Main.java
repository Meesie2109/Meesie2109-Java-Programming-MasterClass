package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        else {
            int digitCount = getDigitCount(number);
            int reversed = reverse(number);
            for (int i = 0; i < digitCount; i++) {
                int digit = reversed % 10;
                reversed /= 10;
                if (digit > 0) {
                    if (digit == 1) System.out.println("One");
                    else if (digit == 2) System.out.println("Two");
                    else if (digit == 3) System.out.println("Three");
                    else if (digit == 4) System.out.println("Four");
                    else if (digit == 5) System.out.println("Five");
                    else if (digit == 6) System.out.println("Six");
                    else if (digit == 7) System.out.println("Seven");
                    else if (digit == 8) System.out.println("Eight");
                    else System.out.println("Nine");
                } else {
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = (reversed * 10) + digit;
            number /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number <= -1) return -1;
        else if (number == 0) return 1;
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
