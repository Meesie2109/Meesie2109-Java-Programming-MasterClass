package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printYearsAndDays(long minutes){
        if(minutes >= 0){
            long years = minutes / 525600;
            long remainingMinutes = minutes % 525600;
            long days = remainingMinutes / 1440;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
