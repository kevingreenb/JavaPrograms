package com.kevingreen;

public class Main {

    public static void main(String[] args) {
	hasTeen(9,99,19);
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        if (num1 >=13 && num1 <= 19){
            return true;
        }
        else if (num2 >=13 && num2 <= 19){
            return true;
        }
        else if (num3 >=13 && num3 <= 19){
            return true;
        }
        return false;
    }
}
