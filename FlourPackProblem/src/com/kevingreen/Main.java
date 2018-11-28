package com.kevingreen;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(canPack(2, 2, 12));
    }

    //bigCount = 5 kilos, smallCount = 1 kilo
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ( bigCount < 0 || smallCount < 0 || goal <0){
            return false;
        }
        int packed = 0;

        while (packed < goal) {
            if (packed + 5 > goal || bigCount == 0) {
                break;
            }
            if (packed + 5 <= goal) {
                bigCount--;
                packed += 5;
            }

        }
        while (packed < goal) {
            if (smallCount == 0) {
                break;
            } else if (packed != goal) {
                smallCount--;
                packed += 1;
            }
        }
        if (packed == goal) {
            return true;
        }
        return false;
    }
}
