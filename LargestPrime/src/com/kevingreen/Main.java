package com.kevingreen;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getLargestPrime(int number){
        int counter = 2;
        int largestPrime = 0;

        if(number > 1)
        {
            while (number > 1)
            {
                if (number % counter == 0) // factor, 3
                {
                    number /= counter; // 7, 7/7 = 1

                    if (number == 1)
                        largestPrime = counter;
                }
                else
                    counter++;
            }
            return largestPrime;
        }
        else
            return -1;
    }
}
