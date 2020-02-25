package com.oa;

import java.util.HashMap;

public class MinAbsDifferenceServerLoads {

    //This code has been tested || Working

    //https://leetcode.com/discuss/interview-question/356433/

    //https://leetcode.com/problems/last-stone-weight-ii/description/

    //https://leetcode.com/playground/pPTMFoBk

    public class Solution{

        public int minDiff(Integer[] loads) {
            HashMap<String, Integer> cache = new HashMap<String, Integer>();
            return minDiff(loads, loads.length - 1, 0, 0, cache);
        }

       public int minDiff(Integer[] loads, int pointer, int server1, int server2,
                           HashMap<String, Integer> cache){
            if(pointer < 0 || loads.length == 0) return Math.abs(server1 - server2);

            String str = pointer + " " + Math.abs(server1 - server2);

            if(! cache.containsKey(str)){
                cache.put(str, Math.min(minDiff(loads, pointer - 1, server1 +
                                loads[pointer], server2, cache),
                        minDiff(loads, pointer - 1, server1, server2 +
                                loads[pointer], cache)));

            }
            return cache.get(str);
        }

//        public static void main(String[] args) {
//            Integer[] data = {1,2,3,4,5};
//            int expected = 1;
//            int actual = minDiff(data);
//            String confirm = expected == actual ? "Correct" : "Incorrect";
//            System.out.println(confirm);
//            System.out.print("Expected Output: ");
//            System.out.println(expected);
//            System.out.print("Code Output: ");
//            System.out.print(actual);
//        }
    }
}
