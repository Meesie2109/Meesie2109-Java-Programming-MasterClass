package com.meesrootjes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 10; i++){
            System.out.println("Enter number #" + i);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int number = scanner.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid input");
                i--;
            }
            scanner.nextLine();//handle next line character (enter key)
        }
        System.out.println("Your total sum = " + sum);
        scanner.close();
;    }
}
