package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
	    printDayOfTheWeek(6);
        bonusChallenge(6);
    }

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("The day of the week is Sunday");
                break;
            case 1:
                System.out.println("The day of the week is Monday");
                break;
            case 2:
                System.out.println("The day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The day of the week is Thursday");
                break;
            case 5:
                System.out.println("The day of the week is Friday");
                break;
            case 6:
                System.out.println("The day of the week is Saturday");
                break;
            default:
                System.out.println("Invalid input number must be between 0 and 6");
        }
    }

    public static void bonusChallenge(int day){
        if(day == 0){
            System.out.println("The day of the week is Sunday");
        } else if (day == 1){
            System.out.println("The day of the week is Monday");
        } else if (day == 2){
            System.out.println("The day of the week is Tuesday");
        } else if (day == 3){
            System.out.println("The day of the week is Wednesday");
        } else if (day == 4){
            System.out.println("The day of the week is Thursday");
        } else if (day == 5){
            System.out.println("The day of the week is Friday");
        } else if (day == 6){
            System.out.println("The day of the week is Saturday");
        } else {
            System.out.println("Invalid input number must be between 0 and 6");
        }

    }

}
