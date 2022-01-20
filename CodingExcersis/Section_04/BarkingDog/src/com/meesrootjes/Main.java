package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
	    boolean test = shouldWakeUp(false, 9);
        System.out.println(test);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay){
        if(!barking){
            return false;
        }
        if(hourOfTheDay >= 0 && hourOfTheDay < 24){
            if(hourOfTheDay < 8 || hourOfTheDay > 22){
                return true;
            }
        }
        return false;
    }
}
