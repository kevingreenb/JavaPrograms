package com.kevingreen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSharedDigit(10, 99));
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if (!(num1 >= 10 && num1 <= 99) || !(num2 >=10 && num2 <= 99)){
            return false;
        }
        char first = Integer.toString(num1).charAt(0);
        char second = Integer.toString(num1).charAt(1);
        char third = Integer.toString(num2).charAt(0);
        char fourth = Integer.toString(num2).charAt(1);
        if ( first == third || first == fourth || second == third || second == fourth){
            return true;
        }
        return false;
    }

}
