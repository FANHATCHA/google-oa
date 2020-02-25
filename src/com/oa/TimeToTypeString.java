package com.oa;

import java.util.HashMap;
import java.util.Map;

public class TimeToTypeString {

    //https://leetcode.com/discuss/interview-question/356477

    public int calculateTime(String keyboard, String word) {

        Map<Character, Integer> hashmap = new HashMap<Character,Integer>();
        for(int i=0; i<keyboard.length(); i++) {
            hashmap.put(keyboard.charAt(i),i);
        }

        int diff =hashmap.get(word.charAt(0));

        for(int i=1; i<word.length(); i++) {
            int n = hashmap.get(word.charAt(i));
            int m = hashmap.get(word.charAt(i-1));
            System.out.println("n= " +n+ "m= "+m);
            diff = diff + Math.abs(n-m);
        }

        return diff;
    }

    /*public int minTime(String str) {
        int prev = 97, time = 0;                                  // ASCII code of 'a' = 97 to start with
        for(int i = 0; i < str.length(); i++) {
            time += Math.abs(str.charAt(i) - prev);
            prev = str.charAt(i);
        }
        return time;
    }*/


}
