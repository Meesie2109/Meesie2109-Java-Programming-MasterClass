package com.meesrootjes;

public class Main {

    public static void main(String[] args) {

        boolean test = hasTeen(12,12,11);
        System.out.println(test);

        boolean testing = isTeen(13);
        System.out.println(testing);
    }

    public static boolean hasTeen(int numberOne, int numberTwo, int numberThree){
        if(numberOne >= 13 && numberOne <= 19 || numberTwo >= 13 && numberTwo <= 19 || numberThree >= 13 && numberThree <= 19){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int numberOne){
        if(numberOne >= 13 && numberOne <= 19){
            return true;
        }
        return false;
    }
}
