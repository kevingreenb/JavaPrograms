package com.kevingreen;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(22,23,24));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if (num1 < 10 || num2 < 10 || num3 < 10 || num1 > 1000 || num2 > 1000 || num3 > 1000){
            return false;
        }
        char first = Integer.toString(num1).charAt(Integer.toString(num1).length()-1);
        char second = Integer.toString(num2).charAt(Integer.toString(num2).length()-1);
        char third = Integer.toString(num3).charAt(Integer.toString(num3).length()-1);
        if (first == second || first == third || second == third){
            return true;
        }
        return false;
    }
}
