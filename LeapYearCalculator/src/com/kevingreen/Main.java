package com.kevingreen;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2017));
    }

    public static boolean isLeapYear(int year) {
        boolean leap = false;
        if (year >= 1 && year <= 9999) {
            leap = ((year%400 == 0) || (year % 4 == 0 && year % 100 != 0));
        }
        return leap;
    }
}
