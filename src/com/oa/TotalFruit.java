package com.oa;

public class TotalFruit {

    //This code has been tested || Working

    //https://leetcode.com/problems/fruit-into-baskets/submissions/

    public int totalFruit(int[] tree) {

        int lastFruit = -1;
        int secondLastFruit = -1;
        int lastFruitCount = 0;
        int currentMax = 0;
        int max = 0;

        for(Integer fruit : tree){
            if(fruit == lastFruit || fruit == secondLastFruit){
                currentMax += 1;
            }
            else{
                currentMax = lastFruitCount + 1;
            }

            if(fruit == lastFruit){
                lastFruitCount += 1;
            }
            else{
                lastFruitCount = 1;
            }

            if(fruit != lastFruit){
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }

            max = Math.max(currentMax, max);
        }
        return max;
    }
}
