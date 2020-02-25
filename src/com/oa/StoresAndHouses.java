package com.oa;

import java.util.TreeSet;

public class StoresAndHouses {

   //This code has been tested || Working

    //https://leetcode.com/discuss/interview-question/350248/Google-or-Summer-Intern-OA-2019-or-Stores-and-Houses


    public class Main {
        public void printArray(int[] arr){
            for(int i: arr) System.out.print(i + " ");
            System.out.println();
        }
        public int[] nearestStores(int[] houses, int[] stores){
            TreeSet<Integer> treeset = new TreeSet<>();
            int lenH = houses.length;
            if(stores.length == 0) return new int[0];
            for(int store: stores) treeset.add(store);
            int[] res = new int[lenH];
            for(int i = 0; i < lenH; ++i){
                int val = houses[i];
                Integer left = treeset.floor(val), right = treeset.ceiling(val);
                if(left == null || right == null)
                    res[i] = left == null? right: left;
                else
                    res[i] = (val - left <= right - val)? left: right;
            }
            return res;
        }



//        public static void main(String[] args) {
//            Main main = new Main();
//            int[][] testcasesH = {{2, 4, 2}, {4, 8, 1, 1}};
//            int[][] testcasesS = {{5, 1, 2, 3}, {5, 3, 1, 2, 6}};
//            for(int i = 0; i < testcasesH.length; ++i)
//                main.printArray(main.nearestStores(testcasesH[i], testcasesS[i]));
//        }
    }

    /*public int[] nearestStores(int[] houses, int[] stores){
        TreeSet<Integer> treeset = new TreeSet<>();
        int lenH = houses.length;
        if(stores.length == 0) return new int[0];
        for(int store: stores) treeset.add(store);
        int[] res = new int[lenH];
        for(int i = 0; i < lenH; ++i){
            int val = houses[i];
            Integer left = treeset.floor(val), right = treeset.ceiling(val);
            if(left == null || right == null)
                res[i] = left == null? right: left;
            else
                res[i] = (val - left <= right - val)? left: right;
        }
        return res;
    }*/

}
