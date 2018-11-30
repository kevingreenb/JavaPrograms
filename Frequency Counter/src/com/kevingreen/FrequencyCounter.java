package com.kevingreen;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public boolean sameFrequency(int num1, int num2){
        String firstNum = Integer.toString(num1);
        HashMap<Character, Integer> frequency = new HashMap<>();
        char testCase;
        int count;
        for (int i = 0; i < firstNum.length(); i++){
            testCase = firstNum.charAt(i);
            if (frequency.containsKey(testCase)){
                count = frequency.get(testCase);
                frequency.put(testCase, count +1);
            }
            else {
                frequency.put(testCase, 1);
            }
        }

        for (Map.Entry<Character, Integer> each: frequency.entrySet()){
            System.out.println(each.getKey() +":"+each.getValue());
        }
        return true;
    }
}
