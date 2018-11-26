package com.kevingreen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumOdd(1, 11));
        System.out.println(isOdd(11));
    }

    public static boolean isOdd(int num){
        if (num < 0){
            return false;
        }
        if (num%2 == 0){
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end){
        if (end<start || start < 0){
            return -1;
        }
        else {
            int total = 0;
            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    System.out.println(i);
                    total += i;
                }
            }
            return total;
        }
    }
}
