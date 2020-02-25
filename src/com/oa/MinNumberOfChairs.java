package com.oa;

import java.util.Arrays;

public class MinNumberOfChairs {

    //Not tested

    //https://leetcode.com/discuss/interview-question/356520

    private static int minChairs(int[] S, int[] E) {
        Arrays.sort(S);
        Arrays.sort(E);

        int i=0, j=0;
        int chairs=1;
        int count =0;


        while(i<S.length) {

            if(S[i] <E[j]) {
                chairs = Integer.max(++count, chairs);
                i++;
            }
            else{
                count --;
                j++;
            }
        }
        return chairs;
    }
}
