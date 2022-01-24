package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean hasSharedDigit(int x, int y) {
        int lx = x / 10, rx = x % 10;
        int ly = y / 10, ry = y % 10;
        if (x >= 10 && x <= 99 && y >= 10 && y <= 99) {
            return lx == ly || lx == ry || rx == ly || rx == ry;
        }
        return false;
    }
}
