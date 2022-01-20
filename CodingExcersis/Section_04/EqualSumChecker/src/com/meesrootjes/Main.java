package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean hasEqualSum(int numberOne, int numberTwo, int numberThird){
        int sum = numberOne + numberTwo;
        if(sum == numberThird){
            return true;
        }
        return false;
    }
}
