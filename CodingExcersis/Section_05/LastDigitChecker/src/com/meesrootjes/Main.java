package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isValid(int n) {
        return n >= 10 && n <= 1000;
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (isValid(n1) && isValid(n2) && isValid(n3)) {
            return n1 % 10 == n2 % 10 || n3 % 10 == n1 % 10 || n2 % 10 == n3 % 10;
        }
        return false;
    }
}
