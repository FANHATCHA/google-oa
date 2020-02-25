package com.oa;

import java.util.Arrays;

public class MaximumNumberStrawberries {

    //This code has been tested || Working

    //https://leetcode.com/discuss/interview-question/396646/

    public static void main(String args[]) {
        int[] fruits = {50, 10, 20, 30, 40};
        int dp[][] = new int[5][101];

        for(int i = 0; i < fruits.length; ++i)
            Arrays.fill(dp[i], -1);

        int res = solve(fruits, fruits.length - 1, 100, dp);
        System.out.println("Result: " + (res == -1 ? 0 : res));
    }

    public static int solve(int fruits[], int k, int available, int dp[][]) {
        if(k < 0)
            return 0;

        if(dp[k][available] == -1) {
            int notSelected = solve(fruits, k - 1, available, dp);
            int selected = available - fruits[k] < 0 ? 0 : fruits[k] + solve(fruits, k - 2, available - fruits[k], dp);
            dp[k][available] = Math.max(notSelected, selected);
        }

        return dp[k][available];
    }
}
