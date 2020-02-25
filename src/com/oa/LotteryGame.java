package com.oa;

import java.util.HashMap;
import java.util.Map;

public class LotteryGame {

    //This code has been tested || Working

    //https://aonecode.com/google-online-assessment#pickup-coupons

    public int minPickupCoupons(int[] coupons) {

        Map<Integer, Integer> hmap = new HashMap<>();
        int price = Integer.MAX_VALUE;
        for(int i=0;i<coupons.length;i++) {
            if(hmap.containsKey(coupons[i])) price = Math.min(price, i - hmap.get(coupons[i]) + 1);
            hmap.put(coupons[i], i);
        }

        return price == Integer.MAX_VALUE?-1:price;
    }
}
