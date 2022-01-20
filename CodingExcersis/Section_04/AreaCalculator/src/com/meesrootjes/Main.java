package com.meesrootjes;

public class Main {

    public static void main(String[] args) {

        System.out.println(area(5.0));
        System.out.println(area(5.0, 4.0));
    }

    public static double area(double radius){
        if(radius >= 0){
            double answer = radius * radius * Math.PI;
            return answer;
        }
        return -1.0;
    }

    public static double area(double x, double y){
        if(y >= 0 && x >= 0){
            double answer = x * y;
            return answer;
        }
        return -1.0;
    }
}
