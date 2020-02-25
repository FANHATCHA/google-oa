package com.oa;

public class MinDominoRotations {

    //This code has been tested || Working

    ///https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/

    public int minDominoRotations(int[] A, int[] B) {
        int resultA = Math.min(countRotations(A[0], A, B), countRotations(A[0], B, A));

        int resultB = Math.min(countRotations(B[0], A, B), countRotations(B[0], B, A));

        int result = Math.min(resultA, resultB);
        return result == Integer.MAX_VALUE?-1:result;
    }

    private int countRotations(int target, int[] A, int[] B){
        int count = 0;
        for(int i=0;i<A.length;i++){

            if(A[i] != target){
                if(B[i] == target){

                    count++;

                }
                else{
                    return Integer.MAX_VALUE;
                }
            }

        }
        return count;
    }

}
