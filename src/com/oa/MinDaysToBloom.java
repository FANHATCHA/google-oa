package com.oa;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

import static java.util.Arrays.*;

public class MinDaysToBloom {

    //No solution found

    //https://leetcode.com/discuss/interview-question/334191

    //https://leetcode.com/discuss/interview-question/334191/Google-or-OA-or-Min-Days-to-Bloom

        /*
        It can be solved using binary search approach.
        1: take lo=1 and hi= max. days a rose needs to bloom
        2: mid = (lo+hi)/2
        3: calculate the no. of bouquets (= x) which we can make when 'mid' no. of days are passed.
        4. if(x<n) lo = mid+1
        else hi = mid
        5. go to step 2
         */
    //https://leetcode.com/problems/sliding-window-maximum/
//DP
    int minDaysBloomByDp(int[] roses, int k, int n) {
        int[] windowKmax = new int[roses.length - k + 1];
        fillMax(windowKmax,roses,k);
        int[][] dp = new int[n+1][roses.length + 1];
        for (int i = 1; i <= n; i++) {
            fill(dp[i],Integer.MAX_VALUE);
            for (int j = k; j <= roses.length; j++) {
                dp[i][j] = Math.min(dp[i][j - 1], Math.max(dp[i - 1][j - k],windowKmax[j - k]));
            }
        }
        return dp[n][roses.length];
    }
    void fillMax(int[] windowKmax, int[] r, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < r.length; i++) {
            if (i >= k && r[i - k] == dq.peekFirst()) dq.pollFirst();
            while (!dq.isEmpty() && r[i] > dq.peekLast()) dq.pollLast();
            dq.offerLast(r[i]);
            if (i >= k - 1) windowKmax[i - k + 1] = dq.peekFirst();
        }
    }



    //BS
    int minDaysBloomByBS(int[] roses, int k, int n) {
        int min = Integer.MAX_VALUE, max = -1;
        for (int r : roses) {
            max = Math.max(r,max);
            min = Math.min(r,min);
        }
        int[] windowKmax = new int[roses.length - k + 1];
        fillMax(windowKmax,roses,k);
        int s = min, e = max;
        while (s <= e) {
            int mid = (e - s)/2 + s;
            if (search(windowKmax,n,k,mid)) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return e + 1;
    }

    boolean search(int[] win,int n,int k,int day) {
        for (int i = 0; i < win.length; ) {
            if (day >= win[i]) {
                n--;
                i+=k;
            } else {
                i++;
            }
        }
        return n <= 0;
    }


private int getMaxInArray(int[] roses) {
    int maxval = roses[0];
    for(int i=1;i<roses.length;i++) {
        maxval = Math.max(maxval, roses[i]);
    }
    return maxval;
}

    private int numBouquetsMthDays(int[] roses, int p, int m) {
        int n = roses.length;
        int num = 0, ctr = 0;
        for(int i=0;i<n;i++) {
            if(roses[i]>m) {
                ctr = 0;
            }
            else {
                ctr++;
                if(ctr==p) {
                    num++;
                    ctr = 0;
                }
            }
        }
        return num;
    }



}
