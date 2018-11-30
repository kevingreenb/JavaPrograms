package com.kevingreen;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public boolean sameFrequency(int num1, int num2){
        String firstNum = Integer.toString(num1);
        String secondNum = Integer.toString(num2);
        HashMap<Character, Character> frequency = new HashMap<Character, Character>();
        for (int i = 0; i < firstNum.length(); i++){
            frequency.put(firstNum.charAt(i), firstNum.charAt(i));
        }

        for (Map.Entry<Character, Character> each: frequency.entrySet()){
            System.out.println(each.getKey());
        }
        return true;
    }
}
