package com.meesrootjes;

public class Main {

    public static void main(String[] args) {

        long test = toMilesPerHour(-25.42);
        System.out.println(test);

        printConversion(-100);
    }

    public static long toMilesPerHour(double kilometerPerHour){

        if(kilometerPerHour < 0){
            return -1;
        }

        double calculateMiles = kilometerPerHour / 1.609;
        long roundedMiles = Math.round(calculateMiles);
        return  roundedMiles;
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0 ){
            System.out.println("Invalid Value");
        } else{
            long miles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }
}
