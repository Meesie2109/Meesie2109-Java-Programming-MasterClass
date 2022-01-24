package com.meesrootjes;

public class Main {

    public static void main(String[] args) {

        boolean test = areEqualByThreeDecimalPlaces(2.33 , 2.33);
        System.out.println(test);
    }

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){
        long numOne = (long) (numberOne * 1000);
        long numTwo = (long) (numberTwo * 1000);
        if(numOne == numTwo){
            return true;
        }

        return false;
    }
}
