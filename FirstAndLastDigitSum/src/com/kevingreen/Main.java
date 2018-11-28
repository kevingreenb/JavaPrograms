package com.kevingreen;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        String newNumber = Integer.toString(number);
        String first = String.valueOf(newNumber.charAt(0));
        String last = String.valueOf(newNumber.charAt(newNumber.length()-1));
        return Integer.parseInt(first) + Integer.parseInt(last);
    }
}
