package com.kevingreen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        isPerfectNumber(6);
    }
    public static boolean isPerfectNumber(int number){
        if( number < 1){
            return false;
        }
        int num = 1;
        int total =0;
        while (num < number){
            if (number%num == 0){
            if (number%num == 0){
                total += num;
            }
            num++;
        }
        if (total == number){
            return true;
        }
        return false;
    }
}
