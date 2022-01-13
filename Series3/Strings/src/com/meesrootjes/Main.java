package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("My string is equal to " + myString);
        myString = myString + " \u00a9 2019";
        System.out.println(myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("My string is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("My string is equal to " + lastString);

    }
}
