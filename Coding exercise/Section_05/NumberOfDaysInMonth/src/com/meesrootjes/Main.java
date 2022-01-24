package com.meesrootjes;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            int dividedByFour = year % 4;
            int dividedByHundred = year % 100;
            int dividedByFourHundred = year % 400;

            if(dividedByFour == 0){
                if(dividedByHundred != 0){
                    return true;
                }
            }

            if(dividedByFourHundred == 0){
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if(month >= 1 && month <= 12){
            if(year >= 1 && year <= 9999){
                switch (month) {
                    case 1:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                    case 3:
                        return 31;
                    case 2:
                        if (isLeapYear(year)) {
                            return 29;
                        }
                        return 28;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    default:
                        return 0;
                }
            }
        }

        return -1;
    }
}
