package com.kevingreen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(reverse(-2));
//        System.out.println(getDigitCount(100));
        numberToWords(100);
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
        else {
            int newNumber = reverse(number);
            int digits = getDigitCount(number);
            for (int i = 0; i < digits; i++){
                int num = newNumber%10;
                switch (num){
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 0:
                        System.out.println("Zero");
                        break;
                }
                newNumber /=10;
            }


        }
    }
    public static int reverse(int number){
        int num1 = Math.abs(number);
        int newNum = 0;
        while (num1 >= 1){
            newNum *= 10;
            newNum += (num1%10);
            num1 /= 10;
        }
        if (number < 0){
            newNum *= -1;
        }
        return newNum;
    }
    public static int getDigitCount(int number){
        int num1 = number;
        int counter = 0;
        if (number < 0){
            return -1;
        }
        if (number == 0){
            return 1;
        }
        while (num1 >= 1){
            counter++;
            num1 /= 10;
        }
        return counter;
    }
}
