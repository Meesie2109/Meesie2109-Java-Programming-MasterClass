package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
        printEqual(-1, 2,3);
    }

    public static void printEqual(int one, int two, int three){
        if(one >= 0 && two >= 0 && three >= 0){
            if (one == two && two == three && three == one) {
                System.out.println("All numbers are equal");
            } else if (one != two && two != three && one != three) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
