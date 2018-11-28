package com.kevingreen;

public class Main {

    public static void main(String[] args) {
	isPalindrome(1234);
    }

    public static boolean isPalindrome(int number){
        int num1 = Math.abs(number);
        int newNum = 0;

        while (num1 >= 1){
            newNum *= 10;
            newNum += (num1%10);
            num1 /= 10;
        }

        System.out.println(newNum);
        if (newNum == Math.abs((number))){
            return true;
        }
        return false;
    }
}
