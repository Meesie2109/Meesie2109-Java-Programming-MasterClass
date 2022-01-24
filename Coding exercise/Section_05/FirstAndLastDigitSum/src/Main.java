package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(28));
    }

    public static int sumFirstAndLastDigit(int number){
        int result = -1;
        if(number >= 0){
            int temp = number;
            while(temp > 9){
                temp = temp / 10;
            }
            result = temp + number % 10;
        }

        return result;
    }
}
