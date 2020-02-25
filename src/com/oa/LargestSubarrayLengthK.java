package com.oa;

public class LargestSubarrayLengthK {

    //https://leetcode.com/discuss/interview-question/352459/

    //Not Test yet

    public int[] largestSubarray(int[] A, int k) {
        int[] result = new int[k];
        int max_start = 0;
        for (int i = 0; i <= A.length - k; i++) {
            for (int j = 0; j < k; j++) {
                if (A[i + j] > A[max_start + j]) max_start = j;
                break;
            }
        }
        for (int i = 0; i < k; i++) {
            result[i] = A[max_start + i];
        }
        return result;

    }

    /*
    public static int[] largestSubArrayK(int[] arr, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] int1, int[] int2) {
                int n = int1.length;
                int compare = 0;
                int i = 0;
                while (i<n) {
                    compare = int2[i] - int1[i];
                    if (compare != 0) break;
                    i++;
                }
                return compare;
            }
        });

        for (int i = 0; i<=arr.length-k;i++) {
            pq.add(Arrays.copyOfRange(arr, i, i+k));
        }

        return pq.poll();

    }
     */

}
