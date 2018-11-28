package com.kevingreen;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printFactors(6);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.print("Invalid Value");
        } else {
            int num = 1;
            while (num <= number){
                if (number%num == 0){
                    System.out.println(num);
                }
                num++;
            }
        }

    }
}
