package com.kevingreen;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        double newNum1 = 1000*num1;
        double newNum2 = 1000*num2;
        if ((int)newNum1 != (int)newNum2){
            return false;
        }
        return true;
    }
}
