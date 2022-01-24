package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Mees", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);
        calculateScore();

        double test = calcFeetAndInchesToCentimeters(6.0, 0.0);
        System.out.println(test);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("no player name, no player score");
        return 0;
    }


    public static double calcFeetAndInchesToCentimeters(double foot, double inches){
        if(foot >= 0 && inches >= 0 && inches <= 12){
            double footToInches = foot * 12;
            double inchesPlusFoot = footToInches + inches;
            double answer = inchesPlusFoot * 2.54;
            return answer;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches <= 12){
            double answer = inches * 2.54;
            return answer;
        }
        return -1;
    }


}
