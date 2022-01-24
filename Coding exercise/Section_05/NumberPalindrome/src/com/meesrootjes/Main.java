package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit, original = number;
        while(number !=0){
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        return original == reverse;
    }
}
