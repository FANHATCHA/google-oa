package com.oa;

import java.util.*;

public class Statistics {

    //No solution found

    //https://leetcode.com/discuss/interview-question/399386/

   /* public static void price(String s[]){
        TreeMap<String, ArrayList> map =new TreeMap<String, ArrayList>();
        List lo=new ArrayList();
        for(String g:s) {
            String h[]=g.split(" ");
            map.putIfAbsent(h[0],new ArrayList<>());
            map.get(h[0]).add(Integer.parseInt(h[1]));
        }

        for(Map.Entry<String,ArrayList> m3:map.entrySet()) {
            String key=m3.getKey();
            ArrayList lik=m3.getValue();
            int min= Collections.min(lik);
            int max=Collections.max(lik);
            int average= (int)lik.stream().mapToInt(a->a).average().getAsDouble();
            lo.add(key+" "+min+" "+max+" "+average);
        }
        System.out.println(lo.toString());
    }*/
}
