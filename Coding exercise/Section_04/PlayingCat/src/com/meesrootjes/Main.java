package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
        boolean test = isCatPlaying(true, 45);
        System.out.println(test);
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            if(temperature >= 25 && temperature <= 45 ){
                return true;
            }
        } else if(!summer){
            if(temperature >= 25 && temperature <= 35 ){
                return true;
            }
        }
        return false;
    }
}
