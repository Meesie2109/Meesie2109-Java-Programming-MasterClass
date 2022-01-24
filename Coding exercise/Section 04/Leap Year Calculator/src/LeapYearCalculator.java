package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
	// write your code here

      boolean test = isLeapYear(1924);
        System.out.println(test);
    }

    public static boolean isLeapYear(int year){

        if(year >= 1 && year <= 9999){
            int dividedByFour = year % 4;
            int dividedByHundred = year % 100;
            int dividedByFourHundred = year % 400;

            if(dividedByFour == 0){
                if(dividedByHundred != 0){
                    return true;
                }
            }

            if(dividedByFourHundred == 0){
                return true;
            }
        }
        return false;
    }
}
