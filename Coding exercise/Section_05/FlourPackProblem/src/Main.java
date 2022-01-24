package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(2,0,5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            int sum = bigCount * 5 + smallCount;
            if (sum == goal) {
                return true;
            } else if (sum > goal) {
                if (smallCount > goal) {
                    return true;
                } else {
                    for (int i = 0; i <= bigCount; i++) {
                        for (int j = 0; j <= smallCount; j++) {
                            if (i * 5 + j == goal) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
