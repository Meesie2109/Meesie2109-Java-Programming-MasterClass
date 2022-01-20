package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int test = 5000 / 1024;
        System.out.println(test);

        printMegaBytesAndKiloBytes(-2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int calculate = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + calculate + " MB and " + remainder + " KB");
        }
    }
}
