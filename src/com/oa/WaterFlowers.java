package com.oa;

public class WaterFlowers {

    //Not found

    //https://leetcode.com/discuss/interview-question/394347/

    public static int waterFlowers(int[] plants, int capacity1, int capacity2) {

        if(plants.length == 0 || plants == null) return 0;

        int pos1 = 0, pos2 = plants.length - 1;
        int remainingWater1 = 0, remainingWater2 = 0;
        int refillCounts = 0;
            while(pos1 < pos2)
            {
                // The first guy water the flower
                if(remainingWater1 < plants[pos1])
                {
                    remainingWater1 = capacity1;
                    refillCounts++;
                }
                remainingWater1 -= plants[pos1++];

                // The second guy water the flower
                if(remainingWater2 < plants[pos2])
                {
                    remainingWater2 = capacity2;
                    refillCounts++;
                }
                remainingWater2 -= plants[pos2--];
            }

        // Checking the middle point
        if(pos1 == pos2 && remainingWater1 + remainingWater2 < plants[pos1])
        {
            if(capacity1 + remainingWater2 >= plants[pos1]) refillCounts++;
            else if(remainingWater1 + capacity2 >= plants[pos1]) refillCounts++;
            else refillCounts += 2;
        }

        return refillCounts;
    }

}
