package com.oa;

public class MaximumTime {

    //This code has been tested || Working

    //https://leetcode.com/discuss/interview-question/396769/

    //https://leetcode.com/playground/HqqoAHmX

    public static String maximumTime(String time){

        char[] cTime = time.toCharArray(), ans = "23:59".toCharArray();
        ans[0] = cTime[1] != '?' && cTime[1] > '3' ? '1' : ans[0];
        ans[1] = cTime[0] != '?' && cTime[0] < '2' ? '9' : ans[1];
        for(int i = 0; i < cTime.length; ++i){
            ans[i] = cTime[i] != '?' ? cTime[i] : ans[i];
        }
        return new String(ans);

    }
}
