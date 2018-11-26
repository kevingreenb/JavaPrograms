package com.kevingreen;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year) {
        boolean leap = false;
        if (year >= 1 && year <= 9999) {
            leap = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
        }
        return leap;
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year > 9999 || year < 1){
            return -1;
        }
        int days = 0;

        if (month == 1){
            days = 31;
        }
        else if (month == 2 && isLeapYear(year)){
            days = 29;
        }
        else if (month == 2){
            days = 28;
        }
        else if (month == 3){
            days = 31;
        }
        else if (month == 4){
            days = 30;
        }
        else if (month == 5){
            days = 31;
        }
        else if (month == 6){
            days = 30;
        }
        else if (month == 7){
            days = 31;
        }
        else if (month == 8){
            days = 31;
        }
        else if (month == 9){
            days = 30;
        }
        else if (month == 10){
            days = 31;
        }
        else if (month == 11){
            days = 30;
        }
        else if (month == 12){
            days = 31;
        }
        return days;
    }
}
