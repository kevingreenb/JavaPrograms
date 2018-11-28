package com.kevingreen;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int total = 0;
        int testNum = 0;
        while (number >= 1) {
            testNum = number%10;
            System.out.println(testNum);
            if (testNum%2 == 0){
                total += testNum;
            }
            number /=10;
        }
        return total;
    }
}
