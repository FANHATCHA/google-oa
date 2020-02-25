package com.oa;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class DecreasingSubsequences {

    //https://leetcode.com/discuss/interview-question/350233/google-summer-intern-oa-2019-decreasing-subsequences

    //This code has been tested || Working

    public  static int minDecPartitions(int[] nums){

        int n = nums.length;

        if(n<2) {
            return n;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();

        int count = 0;

        for(int i=0;i<n;i++) {
            Map.Entry<Integer, Integer> e = map.higherEntry(nums[i]);
            if(e==null) {
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
                count++;
            }
            else {
                if(e.getValue()==1) {
                    map.remove(e.getKey());
                }
                else {
                    map.put(e.getKey(), e.getValue()-1);
                }
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
        }
        return count;
    }

    //O(nlogn)
    /*public class Main {
        public  void main(String[] args) {
            int arr[] = new int[]{2, 9, 12, 13, 4, 7, 6, 5, 10};
            TreeSet<Integer> set = new TreeSet<>();
            int n = arr.length;
            int count = 0;
            for(int i = 0; i<n; i++){
                if(set.ceiling(arr[i]) == null){
                    set.add(arr[i]);
                    count++;
                }else if(set.ceiling(arr[i]) == arr[i]){
                    count++;
                }else{
                    set.remove(set.ceiling(arr[i]));
                    set.add(arr[i]);
                }
            }
            System.out.println(count);
        }
    }*/

    /*
            int arr[] = new int[] {2, 9, 12, 13, 4, 7, 6, 5, 10};
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int n = arr.length;
        for(int i = 0; i<n; i++){
        Entry<Integer, Integer> entry = map.higherEntry(arr[i]);
        if(entry == null) {
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        } else {
        int count = entry.getValue();
        int key = entry.getKey();
        if(count == 1) {
        map.remove(key);
        } else {
        map.put(key, count - 1);
        }
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        }
        int res = 0;
        System.out.println(map);
        for(int key: map.keySet()) {
        res += map.get(key);
        }
     */
    /*public static int minimalSubsequences(int[] nums)
    {
        if(nums == null || nums.length==0)
            return 0;
        List list = new ArrayList<>();
        for(int num:nums)
        {
            if(list.isEmpty())
                list.add(num);
            else
            {
                int index = -1;
                int start =0;
                int end = list.size()-1;
                while(start<=end)
                {
                    int mid=(start+end)/2;
                    if(list.get(mid)>num)
                    {
                        index=mid;
                        end= mid-1;
                    }
                    else
                    {
                        start= mid+1;
                    }
                }
                if(index!=-1)
                {
                    list.set(index, num);
                }
                else
                    list.add(num);
            }
        }
        return list.size();
    }*/
}
