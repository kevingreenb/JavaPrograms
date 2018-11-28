package com.kevingreen;

public class Main {

    public static void main(String[] args) {
    }

    public static int getGreatestCommonDivisor(int first, int second){
    if (first < 10 || second < 10){
        return -1;
    }
    if (first < second){
        int temp = first;
        first = second;
        second = temp;
    }
    int num = second;
    while (num != 0){
        if (first%num == 0 && second%num ==0){
            return num;
        }
        num--;
    }
    return -1;
    }
}
