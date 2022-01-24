package com.meesrootjes;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

	    for(int i = 1; i < 1000; i++){
            if((i % 3 == 0) && (i % 3 ==0)){
                count++;
                sum += 1;
                System.out.println("Found number = " + 1);
            }

            if(count == 5){
                break;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
