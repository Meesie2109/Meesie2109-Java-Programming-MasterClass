package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
        System.out.println(isOdd(2));
        System.out.println(sumOdd(1, 11));
    }

    public static boolean isOdd(int number){
        if( number > 0){
            if(number % 2 == 0){
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end){

        if (end >= start && start >= 0) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                boolean ifOdd = isOdd(i);
                if (ifOdd == true) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
